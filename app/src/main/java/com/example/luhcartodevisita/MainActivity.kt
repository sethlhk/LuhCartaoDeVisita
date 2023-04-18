package com.example.luhcartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.luhcartodevisita.ui.theme.LuhCartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LuhCartãoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Laura ", "Artista")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,cargo: String) {
    Text(text = "Laura", )
    Text(text = "Artista")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LuhCartãoDeVisitaTheme {
        Greeting("Laura","Artista")
    }
}