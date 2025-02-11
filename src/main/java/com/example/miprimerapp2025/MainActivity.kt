package com.example.miprimerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.miprimerapp2025.ui.theme.MiPrimerApp2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MiPrimerApp2025Theme {

                    Greeting()
                }
            }
        }
    }


@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column {
        textFieldSencillo()
        textFieldHolder()
        textFieldKeyboard()
    }
}


@Composable
fun textFieldSencillo() {
    var text by remember { mutableStateOf("Hola") }
    TextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = { Text("Introduce tu nombre") }
    )
    Text(text = "tu nombre es: $text!")
}
@Composable
fun textFieldHolder() {
    var text by remember { mutableStateOf("") }
    TextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        label = { Text("Nombre") },
        placeholder = { Text("Introduce tu Nombre") }

    )
    Text(text = "tu nombre es: $text!")
}
@Composable
fun textFieldKeyboard() {
    var text by remember { mutableStateOf("") }
    TextField(
        text, { newText ->
            text = newText
        },
        label = { Text("Numero") },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)



    )
    Text(text = "tu numero es es: $text!")
}