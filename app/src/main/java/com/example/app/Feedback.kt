package com.example.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.DarkWhite

data class Feedback(val author: String, val image: Int, val date: String, val text: String)

@Composable
fun FeedbackPerson(feedback: Feedback) {



        Column(Modifier.padding(start = 24.dp, top = 30.dp)) {
            Row() {
                val image = painterResource(feedback.image)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))

                Column() {
                    Text(
                        feedback.author,
                        color = Color.White,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        letterSpacing = 0.5.sp,
                        fontFamily = skModernistRegular
                    )
                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        feedback.date,
                        color = Color.White.copy(0.4f),
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        letterSpacing = 0.5.sp,
                        fontFamily = skModernistRegular
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                feedback.text,
                modifier = Modifier
                    .padding(end = 24.dp),
                color = DarkWhite,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                letterSpacing = 0.5.sp,
                fontFamily = skModernistRegular
            )

        }


}

@Preview()
@Composable
fun FeedbackPersonPreview() {

    FeedbackPerson(
        Feedback(
            image = R.drawable.person_1,
            author = "Auguste Conte",
            date = "February 14, 2019",
            text = "“Once you start to learn its secrets, there’s a wild" +
                    " and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    )
}