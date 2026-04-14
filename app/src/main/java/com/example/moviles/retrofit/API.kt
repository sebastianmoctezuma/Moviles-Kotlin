package com.example.moviles.retrofit

class API {
    private val service =
        RetrofitHelper.getRetrofitService()
    suspend fun getImagenAleatoria():String{
        val response =
            service.imagenRandom()
        val msg : String
        if (response.body()?.status.equals("success")){
            msg = response.body()?.message ?: ""
        }else{
            msg = "Fail"
        }
        return msg
    }

}