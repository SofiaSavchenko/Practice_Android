package com.example.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.LightWhite

@Composable
fun DescriptionGame(description: String) {

    Text(
        text = description,
        modifier = Modifier
            .padding(top = 24.dp, start = 24.dp, end = 24.dp)
            .alpha(0.7f),
        color = LightWhite,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        fontFamily = skModernistRegular,
        lineHeight = 19.sp
    )
}

@Preview
@Composable
fun DescriptionGamePreview() {

    val context = LocalContext.current
    DescriptionGame(context.getString(R.string.description_game))
}