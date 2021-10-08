package com.sistecredito.ciclosfor.scopeFunctions

fun main(args: Array<String>){
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .apply {
            removeIf{ movil -> movil.contains("Google") }
        }
    println(moviles)

    var colores : MutableList<String>? = null
    colores?.apply {
        //no lo corre porque es nulo
        println("Colores nulos $this")
        println("Cantidad nula $size")
    }

    val colores2 : MutableList<String> = mutableListOf("Amarillo","Azul","Rojo")
    colores2?.apply {
        //lo corre porque no es nulo
        println("Colores no nulos $this")
        println("Cantidad no nula $size")
    }

}