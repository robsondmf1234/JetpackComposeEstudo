package com.example.jetpackcomposeestudos

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeestudos.ui.theme.JetPackComposeEstudosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeEstudosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

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
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true,
    backgroundColor = 0xffdcdcdc
)
@Composable
fun ColunPreview() {
    Column {
        Text(text = "Primeiro Texto.")
        Text(text = "Primeiro Texto.")
    }
}

@Preview(
    uiMode = UI_MODE_NIGHT_NO,
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
    uiMode = UI_MODE_NIGHT_NO,
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
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true,
    backgroundColor = 0xffdcdcdc
)
@Composable
fun CustomPreview() {
    Column(Modifier.background(color = MaterialTheme.colorScheme.primary)) {
        Text(text = "Primeiro Texto.")
        Text(text = "Segundo Texto.")
        Row(Modifier.background(color = MaterialTheme.colorScheme.inverseOnSurface)) {
            Text(text = "Terceiro Texto.")
            Text(text = "Quarto Texto.")
        }
        Box(Modifier.background(color = MaterialTheme.colorScheme.secondary)) {
            Column {
                Row {
                    Text(text = "Quinto Texto.")
                    Text(text = "Sexto Texto.")
                }
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
