package com.example.miprimerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.miprimerapp2025.ui.theme.MiPrimerApp2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimerApp2025Theme {
                    GreetingPreview()
                }
            }
        }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Content("Camaron","Caramelo")
}
@Composable
fun Content(mensaje1:String,mensaje2:String){
    Column{
        Text(mensaje1, fontSize = 30.sp)
        Text(mensaje2, lineHeight = 30.sp)
        Text("Luis",  fontSize = 30.sp,
            lineHeight = 32.sp);

    }

}