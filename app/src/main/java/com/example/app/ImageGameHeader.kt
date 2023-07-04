package com.example.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.DarkGray_1
import com.example.app.ui.theme.LightGray_1


@Composable
fun ImageGameHeader(usageLevel: String) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(R.drawable.characters),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(296.dp)
                .aspectRatio(1f)

        )

        Row(Modifier.padding(start = 24.dp, top = 308.dp)) {

            Box(
                modifier = Modifier
                    .width(88.dp)
                    .height(88.dp)
                    .background(color = Color.Black,  shape = RoundedCornerShape(13.5.dp))
                    .border(
                        width = 2.dp,
                        color = DarkGray_1,
                        shape = RoundedCornerShape(13.5.dp)
                    )

            ) {
                Image(
                    painter = painterResource(R.drawable.icon_game),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(17.dp)
                )
            }
            Spacer(modifier = Modifier.width(12.dp))

            Box(Modifier.padding(top = 34.dp)) {
                Column() {
                    Text(
                        text = "DoTA 2",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        fontFamily = skModernistBold
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        repeat(5) {
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(end = 4.dp)
                                    .width(12.dp)
                                    .height(12.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = usageLevel,
                            color = LightGray_1,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            fontFamily = skModernistRegular
                        )
                    }
                }
            }
        }
    }
}