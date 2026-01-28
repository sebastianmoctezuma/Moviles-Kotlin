package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)

fun Cajas (){
    Box(Modifier.fillMaxSize()) {
        CajaInterna( alineacion=Alignment.TopCenter)
        CajaInterna( alineacion= Alignment.BottomCenter)

    }
}

@Composable
fun CajaInterna( alineacion: Alignment){
    Box(Modifier.fillMaxSize(),contentAlignment = alineacion) {
        Box(modifier= Modifier.size(300.dp)){
            Text(text="A",Modifier.background(Color.Red).align(Alignment.Center), fontSize = 52.sp, color = Color.White )
            Text(text="B",Modifier.background(Color.Blue).align(Alignment.TopEnd),fontSize = 52.sp, color=Color.White)
            Text(text="C",Modifier.background(Color.Green).align(Alignment.BottomEnd),fontSize = 52.sp,color=Color.White)
            Text(text="D",Modifier.background(Color.Yellow).align(Alignment.TopStart),fontSize = 52.sp,color=Color.White)
            Text(text="E",Modifier.background(Color.Cyan).align(Alignment.CenterStart),fontSize = 52.sp,color=Color.White)
            Text(text="F",Modifier.background(Color.Magenta).align(Alignment.CenterEnd),fontSize = 52.sp,color=Color.White)
            Text(text="G",Modifier.background(Color.LightGray).align(Alignment.BottomStart),fontSize = 52.sp,color=Color.White)
            Text(text="H",Modifier.background(Color.DarkGray).align(Alignment.TopCenter),fontSize = 52.sp,color=Color.White)
            Text(text="I",Modifier.background(Color.Green).align(Alignment.BottomCenter),fontSize = 52.sp,color=Color.White)
        }

    }


}


