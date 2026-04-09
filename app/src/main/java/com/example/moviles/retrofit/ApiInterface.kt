package com.example.moviles.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("breeds/image/random")
    suspend fun imagenRandom(): Response<ImagenRandom>
}