package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.ui.theme.letraamarilla
import com.example.moviles.ui.theme.letrablanca


@Preview(showBackground = true)
@Composable
fun Modificador (){
    Text( text= "Hola ",
        modifier = Modifier
            .background(Color(0xFF186961))
            .padding(7.dp) //color y tamaño de fondo
            //.background(Color.Magenta)
            .padding(vertical = 14.dp) //forma de padding
            .alpha(0.9f)// transparencia
            .blur(0.dp ) // que se vea borroso
            //.border(1.dp, Color.Cyan) // borde
            .shadow(elevation = 0.dp) //sombra
            .rotate(0f), // rotacion del texto
        color= letraamarilla,
        fontSize = 12.sp


    )

}

