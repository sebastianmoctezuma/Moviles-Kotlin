package com.example.moviles.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun PDFView(generarReporte: ReportModel= ReportModel(numSeccion = 1, nombreEncargado = "juan", nombreSeccion ="pollo" ) ){
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Nombre de la seccion:${generarReporte.nombreSeccion}")
        Text("Numero de la seccion:${generarReporte.numSeccion}")
        Text("Nombre del encargado:${generarReporte.nombreEncargado}")
    }
}

//@Preview(showBackground = true)
@Composable

fun PDFPreview(){
    val reporte = ReportModel(numSeccion = 1, nombreEncargado = "juan", nombreSeccion ="pollo" )
    PDFView(generarReporte = reporte)
}
