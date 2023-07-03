package com.example.app

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.DarkBlue

@Composable
fun InstallButton(name: String) {
    Button(
        onClick = { /* Действие при нажатии на кнопку */ },
        colors = ButtonDefaults.buttonColors(Color(0xFFF4D144)),
        modifier = Modifier
            .padding(horizontal = 24.dp, vertical = 40.dp)
            .fillMaxWidth()
            .height(70.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            text = name,
            color = DarkBlue,
            modifier = Modifier.wrapContentSize(Alignment.Center),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun InstallButtonPreview() {

    val context = LocalContext.current
    DescriptionGame(context.getString(R.string.installButton_name))

}