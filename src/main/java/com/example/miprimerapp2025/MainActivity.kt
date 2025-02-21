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


@Composable
fun AppContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.andy_rubin),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            var cost by remember { mutableStateOf(TextFieldValue("")) }
            var discount by remember { mutableStateOf(TextFieldValue("")) }
            var finalPrice by remember { mutableStateOf("") }

            BasicTextField(
                value = cost,
                onValueChange = { cost = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .background(Color.White),
                decorationBox = { innerTextField ->
                    if (cost.text.isEmpty()) {
                        Text(text = "Enter product cost", color = Color.Gray)
                    }
                    innerTextField()
                }
            )

            BasicTextField(
                value = discount,
                onValueChange = { discount = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .background(Color.White),
                decorationBox = { innerTextField ->
                    if (discount.text.isEmpty()) {
                        Text(text = "Enter discount (%)", color = Color.Gray)
                    }
                    innerTextField()
                }
            )

            Button(
                onClick = {
                    val costValue = cost.text.toDoubleOrNull() ?: 0.0
                    val discountValue = discount.text.toDoubleOrNull() ?: 0.0
                    val discountAmount = costValue * (discountValue / 100)
                    finalPrice = "Final Price: \$${costValue - discountAmount}"
                },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Calculate")
            }

            if (finalPrice.isNotEmpty()) {
                Text(
                    text = finalPrice,
                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewAppContent() {

        AppContent()

}

