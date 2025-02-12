package com.example.miprimerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
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
                PreviewExamples()
            }
        }
    }
}

@Composable
fun Examples() {
    Column(modifier = Modifier.padding(16.dp)) {
        TextFieldExamples()
        Spacer(modifier = Modifier.height(20.dp))
        ButtonExamples()
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

@Composable
fun ButtonExamples() {
    Column(modifier = Modifier.padding(16.dp)) {
        SimpleButton()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithColor()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithTwoTextView()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithIcon()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithRectangleShape()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithRoundCornerShape()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithCutCornerShape()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithBorder()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithElevation()
    }
}

@Composable
fun SimpleButton() {
    Button(onClick = {}) {
        Text(text = "Simple Button")
    }
}

@Composable
fun ButtonWithColor() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)
    ) {
        Text(text = "Button with gray background", color = Color.White)
    }
}

@Composable
fun ButtonWithTwoTextView() {
    Button(onClick = {}) {
        Text(text = "Click ", color = Color.Magenta)
        Text(text = "Here", color = Color.Green)
    }
}

@Composable
fun ButtonWithIcon() {
    Button(onClick = {}) {
        Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon")
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "Add to cart")
    }
}

@Composable
fun ButtonWithRectangleShape() {
    Button(onClick = {}, shape = RectangleShape) {
        Text(text = "Forma de Rectangulo")
    }
}

@Composable
fun ButtonWithRoundCornerShape() {
    Button(onClick = {}, shape = RoundedCornerShape(20.dp)) {
        Text(text = "Esquina redondeada")
    }
}

@Composable
fun ButtonWithCutCornerShape() {
    Button(onClick = {}, shape = CutCornerShape(10.dp)) {
        Text(text = "Esquina en corte")
    }
}

@Composable
fun ButtonWithBorder() {
    Button(
        onClick = {},
        border = BorderStroke(1.dp, Color.Red),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
    ) {
        Text(text = "Boton con borde", color = Color.DarkGray)
    }
}

@Composable
fun ButtonWithElevation() {
    Button(
        onClick = {},
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = "Button con elevacion")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExamples() {
    Examples()
}
