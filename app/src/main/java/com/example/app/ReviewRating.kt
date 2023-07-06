package com.example.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.DarkWhite
import com.example.app.ui.theme.LightWhite

@Composable
fun ReviewRating(rating: String, reviews: String) {
    Column {
        Text(
            text = "Review & Ratings",
            color = LightWhite,
            modifier = Modifier.padding(start = 24.dp, top = 24.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            fontFamily = skModernistBold
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(
            modifier = Modifier.padding(start = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = rating,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 48.sp,
                fontFamily = skModernistBold
            )

            Column(Modifier.padding(start = 16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    repeat(4) {
                        Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(end = 4.dp)
                                .width(12.dp)
                                .height(12.dp)
                        )
                    }
                    Image(
                        painter = painterResource(R.drawable.star_50),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 4.dp)
                            .width(12.dp)
                            .height(12.dp)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = reviews,
                    color = DarkWhite,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    letterSpacing = 0.5.sp,
                    fontFamily = skModernistRegular
                )
            }
        }
    }
}

@Preview
@Composable
fun ReviewRatingPreview() {

    val context = LocalContext.current
    ReviewRating(context.getString(R.string.rating), context.getString(R.string.reviews))

}