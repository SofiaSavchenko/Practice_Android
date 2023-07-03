package com.example.app

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScenesGame() {
    LazyRow(Modifier.padding(top = 24.dp, start = 24.dp)) {
        item {
            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(R.drawable.scene_1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 240.dp, height = 128.dp)
                        .padding(end = 16.dp)
                        .clip(shape = RoundedCornerShape(14.dp))
                )
                IconButton(
                    onClick = { },
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.4f))
                        .border(
                            BorderStroke(
                                width = 1.dp,
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        Color.White.copy(alpha = 0f),
                                        Color.White.copy(alpha = 0.4f)
                                    ),
                                    start = Offset.Zero,
                                    end = Offset.Infinite
                                )
                            ),
                            shape = CircleShape
                        )
                        .align(Alignment.Center)
                )
                {
                    Image(
                        painter = painterResource(R.drawable.icon_start),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
        item {
            Image(
                painter = painterResource(R.drawable.scene_2),
                contentDescription = null,
                modifier = Modifier
                    .size(width = 240.dp, height = 128.dp)
                    .padding(start = 16.dp)
                    .clip(shape = RoundedCornerShape(14.dp))
            )
        }

    }
}

@Preview
@Composable
fun ScenesGamePreview(){

    ScenesGame()

}