package com.example.jetpackcomposeestudos.ui

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Ola $name!",
            modifier = modifier
        )
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    backgroundColor = 0xffdcdcdc
)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Primeiro Texto.")
        Text(text = "Primeiro Texto.")
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    backgroundColor = 0xffdcdcdc
)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Primeiro texto.")
        Text(text = "Segundo Texto.")
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    backgroundColor = 0xffdcdcdc
)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Primeiro texto.")
        Text(text = "Segundo texto.")
    }
}


@Preview(
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
)
@Composable
fun CustomPreview() {
    Column(
        Modifier //Modificador de layout
            .padding(4.dp) //Define o padding do layout
            .background(color = Color.Blue) //Define a cor de fundo do layout
            .padding(8.dp) //Define o padding do layout interno
            .fillMaxHeight() //Define a altura do layout como maxima
            .fillMaxWidth() //Define a largura do layout como maxima
    ) {
        Text(text = "Primeiro Texto.", color = Color.White)
        Text(
            text = "Segundo Texto.", style = TextStyle(//Define o estilo do texto
                fontWeight = FontWeight.Bold, // Define a espessura da fonte como negrito
                fontSize = 16.sp, // Define o tamanho da fonte
                color = Color.Black // Define a cor do texto
            )
        )
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .background(color = Color.Green)
        ) {
            Text(text = "Terceiro Texto.")
            Text(text = "Quarto Texto.")
        }
        Box(
            modifier = Modifier
                .padding(16.dp)
                .background(color = Color.Red)
        ) {
            Row(
                Modifier
                    .background(color = Color.Cyan)
                    .fillMaxWidth()
            ) {
                Text(text = "Quinto Texto.")
                Text(text = "Sexto Texto.")
            }
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Color.White)
            ) {

                Text(text = "Setimo Texto.")
                Text(text = "Oitavo Texto.")
            }

        }
    }
}

/*

@Preview(
    name = "Light Mode",
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true,
    showSystemUi = true,
    backgroundColor = 0xffdcdcdc
)
@Composable
fun GreetingPreview() {
    JetPackComposeEstudosTheme {
        Surface {
            Greeting("Android")
        }
    }
}*/
