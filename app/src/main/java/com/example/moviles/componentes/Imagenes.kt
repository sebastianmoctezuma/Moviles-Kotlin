package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable

fun Imagenes(){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.spas),
            contentDescription = "foto spas",
            modifier = Modifier.size(200.dp).clip(CircleShape),
            contentScale = ContentScale.FillHeight,
        )
        Icon(painter = painterResource(R.drawable.outline_account_circle_24),
            contentDescription = null,
            tint = Color(color = 0xFF4CAF50),
            modifier = Modifier.size(150.dp)
        )

    }

}

