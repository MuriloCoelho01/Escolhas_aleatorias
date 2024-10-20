package com.demoday.escolhasaleatrias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.demoday.escolhasaleatrias.ui.theme.EscolhasAleatóriasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EscolhasAleatóriasTheme() {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Inicio(
                        name = "Android"
                    )
                }
            }
        }
    }
}

@Composable
fun Inicio(name: String, modifier: Modifier = Modifier) {

var texto = "Murilo"
    var teste by remember {
        mutableStateOf(1)
    }
    var escolha = when(teste){
        1 -> "Ação"
        2 -> "Aventura"
        3 -> "Comédia"
        4 -> "Drama"
        5 -> "Terror"
        6 -> "Ficção Científica"
        7 -> "Fantasia"
        8 -> "Romance"
        9 -> "Mistério"
        10 -> "Documentário"
        11 -> "Musical"
        else -> "Animação"


    }



    Column(

        modifier = Modifier
            .background(color = Color(0xFF000000))
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = "O filme de hoje é:",
            fontSize = 45.sp,
            color = Color.White
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp),
        ) {
            Text(
                text = escolha,
                fontSize = 25.sp,
                color = Color.Blue,
                modifier = Modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
        Button(
            onClick = {
                teste = (1..12).random()
            },
            modifier = Modifier
                .padding(20.dp)
                .width(200.dp)
                .height(50.dp)

        ) {
            Text(
                text = "Sortear",
                fontSize = 30.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EscolhasAleatóriasTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Inicio(
                name = "Android"
            ) // Chama a função sem parâmetros
        }
    }}