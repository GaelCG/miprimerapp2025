package com.example.miprimerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miprimerapp2025.ui.theme.MiPrimerApp2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPrimerApp2025Theme {
                AppContent()
            }
        }
    }
}
@Preview
@Composable
fun AppContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.imagebackground),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.align(Alignment.Center)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            var text1 by remember { mutableStateOf(TextFieldValue("")) }
            var text2 by remember { mutableStateOf(TextFieldValue("")) }

            BasicTextField(
                value = text1,
                onValueChange = { text1 = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .background(Color.White)
            )

            BasicTextField(
                value = text2,
                onValueChange = { text2 = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .background(Color.White)
            )
// estilos
            Button(
                onClick = { /* Handle button click */ },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Calcular")
            }
        }
    }
}
