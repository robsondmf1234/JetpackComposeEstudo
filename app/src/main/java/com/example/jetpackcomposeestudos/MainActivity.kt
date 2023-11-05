package com.example.jetpackcomposeestudos

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposeestudos.ui.components.ChallengeComposable
import com.example.jetpackcomposeestudos.ui.theme.JetPackComposeEstudosTheme
import com.example.jetpackcomposeestudos.ui.theme.Purple40
import com.example.jetpackcomposeestudos.ui.theme.Purple500
import com.example.jetpackcomposeestudos.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeEstudosTheme {
                ProductItem()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductItem() {
    Column(
        Modifier
            .height(250.dp)
            .width(200.dp)
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Teal200, Purple500)
                    )
                )
                .fillMaxWidth()

        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            Modifier
                .size(100.dp)
                .offset(y = (-50).dp)
                .clip(shape = CircleShape)
                .align(CenterHorizontally)
        )
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

