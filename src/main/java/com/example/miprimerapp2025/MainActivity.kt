package com.example.miprimerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.miprimerapp2025.ui.theme.MiPrimerApp2025Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPrimerApp2025Theme {
                Content()
                Content2()
                Content3()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Content(){
    Text("GAEL COSTILLA GARCIA",
            Modifier.padding(32.dp) // Outer padding (margin)
        .background(color = Color.Green) //background color
        .padding(16.dp) // Inner padding
    )
}
@Preview(showBackground = true)
@Composable
fun Content2(){
    Text("GAEL COSTILLA GARCIA",
        color = Color.White,
        modifier = Modifier
            .background(Color.Blue)
            .width(200.dp)
            .height(300.dp))

}

@Preview(showBackground = true)
@Composable
fun Content3(){
    Text("GAEL COSTILLA GARCIA",
        color = Color.White,
        modifier = Modifier
            .background(Color.Cyan)
            .size(width = 250.dp, height = 100.dp)
    )

}

@Preview(showBackground = true)
@Composable
fun Content4(){
    Text("GAEL COSTILLA GARCIA",
        color = Color.White,
        modifier = Modifier
            .background(Color.Gray)
            .padding(Dp(10f))
            .fillMaxWidth(1f)
    )

}

@Preview(showBackground = true)
@Composable
fun Content5(){
    Text("GAEL COSTILLA GARCIA",
        color = Color.White,
        modifier = Modifier
            .background(Color.Gray)
            .padding(Dp(10f))
            .fillMaxWidth(1f)
    )

}

