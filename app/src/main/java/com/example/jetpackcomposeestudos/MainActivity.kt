package com.example.jetpackcomposeestudos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeestudos.ui.theme.JetPackComposeEstudosTheme
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

@Composable
@Preview(showBackground = true, showSystemUi = true)
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
                        colors = listOf(
                            Purple500, Teal200
                        )
                    )
                )
                .fillMaxWidth()

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                Modifier
                    .size(100.dp)
                    .offset(y = 50.dp)
                    .clip(shape = CircleShape)
                    .align(BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(48.dp))
        Column(Modifier.padding(16.dp)) {
            Text(
                text = LoremIpsum(50).values.first(),
                fontSize = 18.sp,
                fontWeight = FontWeight(700),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "R$ 14,99",
                Modifier.padding(top = 8.dp,),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun exerciseCompose() {
    Surface(
        Modifier.padding(0.dp),
        shape = RoundedCornerShape(12.dp),
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(100.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Teal200, Purple500)
                        )
                    )
            )
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                Modifier
                    .size(100.dp)
                    .offset(x = ((-50).dp))
                    .align(Alignment.CenterVertically)
                    .clip(shape = CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = LoremIpsum(50).values.first(),
                maxLines = 6,
                modifier = Modifier.align(Alignment.CenterVertically),
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

