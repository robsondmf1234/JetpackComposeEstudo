package com.example.jetpackcomposeestudos.ui.exercises

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeestudos.R
import com.example.jetpackcomposeestudos.ui.theme.Purple500
import com.example.jetpackcomposeestudos.ui.theme.Teal200

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ChallengeComponent() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        shadowElevation = 4.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            Modifier
                .height(250.dp)
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
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .size(100.dp)
                        .offset(x = 50.dp)
                        .clip(shape = CircleShape)
                        .align(Alignment.Center)
                )
            }
            Spacer(modifier = Modifier.padding(22.dp))
            Text(
                fontSize = 20.sp,
                text = LoremIpsum(30).values.first(),
                maxLines = 6,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(16.dp)
            )
        }
    }


}