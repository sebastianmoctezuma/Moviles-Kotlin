package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable

fun ProductView(imagen= ) {

    Card(modifier = Modifier.fillMaxWidth().padding(10.dp), colors = CardDefaults.cardColors(containerColor = Color(White)
    )){
        Column(modifier = Modifier.fillMaxWidth()) {
            Row{
                Image(
                    painter = painterResource(producto. imagen),
                    contentDescription = "imagen de producto",
                    modifier = Modifier
                        .size(120.dp)
                        .align(Alignment.CenterVertically)
                )
                Column{
                    Text(text = "Macbook pro de 14 pulgadas", fontSize = 20.sp)
                    Text(text = "⭐️4.8 estrellas")
                    Text(text = "$12,999", fontWeight = FontWeight.Bold)
                    Text(text = "LLega el viernes")
                    Spacer(modifier = Modifier.size(10.dp))
                    Button(
                        onClick = {}, colors = ButtonDefaults.buttonColors(
                            contentColor = Color(0xFF000000),
                            containerColor = Color(0xFFFFD711)
                        )
                    )
                    { Text(text = "Agregar al carrito") }
                }
            }
        }
    }

}