package com.example.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.DarkTurquoise
import com.example.app.ui.theme.Turquoise

@Composable
fun KeyWords() {
    Row(Modifier.padding(start = 24.dp, top = 16.dp)) {
        Box(
            modifier = Modifier
                .height(22.dp)
                .width(53.dp)
                .clip(RoundedCornerShape(100))
                .background(Turquoise.copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "MOBA",
                color = DarkTurquoise,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                fontFamily = montserratRegular
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .width(93.dp)
                .height(22.dp)
                .clip(RoundedCornerShape(100))
                .background(Turquoise.copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "MULTIPLAYER",
                color = DarkTurquoise,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                fontFamily = montserratRegular

            )
        }
        Spacer(modifier = Modifier.width(10.dp))

        Box(
            modifier = Modifier
                .width(73.dp)
                .height(22.dp)
                .clip(RoundedCornerShape(100))
                .background(Turquoise.copy(alpha = 0.24f)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "STRATEGY",
                color = DarkTurquoise,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                fontFamily = montserratRegular
            )
        }
    }
}

@Preview
@Composable
fun KeyWordsPreview() {

    KeyWords()
}