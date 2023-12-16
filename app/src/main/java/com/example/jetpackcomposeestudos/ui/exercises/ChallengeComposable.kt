package com.example.jetpackcomposeestudos.ui.exercises

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ChallengeComposable() {
    Row(
        Modifier
            .height(150.dp)
            .fillMaxWidth()
    ) {
        Box(
            Modifier
                .width(100.dp)
                .height(150.dp)
                .background(Color.Blue)
        )
        Column {
            Text(
                "Test 1",
                Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .background(Color(0xFFededed))
                    .padding(16.dp)
            )
            Text(
                "Test 2",
                Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .background(Color(0xFFededed))
                    .padding(16.dp)
            )
        }
    }
}