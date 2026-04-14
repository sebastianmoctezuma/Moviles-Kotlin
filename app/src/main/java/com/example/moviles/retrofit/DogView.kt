package com.example.moviles.retrofit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage

@Composable
fun DogView(dogViewModel: DogViewModel){
    Column(Modifier.fillMaxSize()) {
        Text("EL cachorro de hoy es:")
        Button(onClick = {
            dogViewModel.traerUrlImagen()
        }) {
            Text("Mostrar imagen")
        }
        Text(dogViewModel.url)
        if (dogViewModel.url.isNotBlank()){
            AsyncImage(
                model = dogViewModel.url,
                contentDescription= null
            )
        }
    }

}