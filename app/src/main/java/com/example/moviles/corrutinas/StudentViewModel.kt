package com.example.moviles.corrutinas
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.lang.Thread.sleep

class StudentViewModel: ViewModel() {
    var winner by mutableStateOf("")
    private set

    var isLoading by mutableStateOf(false)
        private set

    var lista = mutableListOf<String>()
    init {
        lista = mutableListOf("Juan","Pedro","Luis","Jose","Benito","Otro")
    }
    fun getWinner(){
        isLoading = true
        try {
            viewModelScope.launch {
                winner = ""
                changePerson()
            }
        }catch (e : Exception){
            Log.e("ERROR BACKGROUND","Error en el modulo studentsViewModel $e")
        }finally {
            isLoading = false
        }

    }

    suspend fun changePerson(){
        withContext(Dispatchers.IO){
            isLoading = true
            delay(5000)
            winner = "Juan Perez Perez"
            isLoading = false
        }
    }
}

