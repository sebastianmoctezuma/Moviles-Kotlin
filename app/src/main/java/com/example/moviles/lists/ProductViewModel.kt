package com.example.moviles.lists

import com.example.moviles.R

class ProductViewModel {
    fun getProducts(): List<ProductModel>{
        var productList = mutableListOf<ProductModel>()
        productList.add(ProductModel(imagen = R.drawable.fotomac, nombre = "Macbook Air", calificacion = 4.9f, precio = 12000, entrega = "sabado"))
        productList.add(ProductModel(imagen = R.drawable.spas, nombre = "Pump dorada", calificacion = 5.0f, precio = 20000, entrega = "Mañana"))
        productList.add(ProductModel(imagen = R.drawable.iphone17foto, nombre = "Iphone 17 Pro", calificacion = 4.9f, precio = 10000, entrega = "Domingo"))
        productList.add(ProductModel(imagen= R.drawable.applewatchfoto, nombre = "Apple Watch Series 10", calificacion = 5.0f, precio = 10000, entrega = "Sabado"))
        productList.add(ProductModel(imagen= R.drawable.macbookprofoto, nombre = "Macbook Pro", calificacion = 5.0f, precio = 10000, entrega = "Sabado"))
        productList.add(ProductModel(imagen= R.drawable.fotomac, nombre = "Macbook Air", calificacion = 5.0f, precio = 10000, entrega = "Sabado"))
        productList.add(ProductModel(imagen= R.drawable.fotomac, nombre = "Macbook Air", calificacion = 5.0f, precio = 10000, entrega = "Sabado"))
        productList.add(ProductModel(imagen= R.drawable.fotomac, nombre = "Macbook Air", calificacion = 5.0f, precio = 10000, entrega = "Sabado"))
        productList.add(ProductModel(imagen= R.drawable.fotomac, nombre = "Macbook Air", calificacion = 5.0f, precio = 10000, entrega = "Sabado"))
        productList.add(ProductModel(imagen= R.drawable.fotomac, nombre = "Macbook Air", calificacion = 5.0f, precio = 10000, entrega = "Sabado"))
        return productList

    }
}