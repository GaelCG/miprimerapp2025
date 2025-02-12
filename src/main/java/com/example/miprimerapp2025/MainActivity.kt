package com.example.miprimerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miprimerapp2025.ui.theme.MiPrimerApp2025Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPrimerApp2025Theme {
                PreviewTextFieldExamples()
            }
        }
    }
}

@Composable
fun TextFieldExamples() {
    Column(modifier = Modifier.padding(16.dp)) {
        SimpleTextField()
        Spacer(modifier = Modifier.height(10.dp))
        LabelAndPlaceHolder()
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldWithInputType()
        Spacer(modifier = Modifier.height(10.dp))
        OutLineTextFieldSample()
        Spacer(modifier = Modifier.height(10.dp))
        TextFieldWithIcons()
    }
}

@Composable
fun SimpleTextField() {
    var texto by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = texto,
        onValueChange = { nuevoTexto -> texto = nuevoTexto }
    )
}

@Composable
fun LabelAndPlaceHolder() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "Your Label") },
        placeholder = { Text(text = "Your Placeholder/Hint") },
    )
}

@Composable
fun TextFieldWithInputType() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "Number Input Type") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}

@Composable
fun OutLineTextFieldSample() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "Enter Your Name") }
    )
}

@Composable
fun TextFieldWithIcons() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "Email address") },
        placeholder = { Text(text = "Enter your e-mail") },
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTextFieldExamples() {
    TextFieldExamples()

}