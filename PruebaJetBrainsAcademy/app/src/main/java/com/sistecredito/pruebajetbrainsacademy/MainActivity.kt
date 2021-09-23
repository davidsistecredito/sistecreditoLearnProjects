package com.sistecredito.pruebajetbrainsacademy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        probando()
    }
}

fun probando(){
    println("Prueba de código impreso a la consola.")

    print("Por favor ingrese el número:")

    val numero1 = readLine()

    print("Ha ingresado el: $numero1")
}