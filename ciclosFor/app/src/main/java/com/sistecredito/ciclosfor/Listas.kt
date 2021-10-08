package com.sistecredito.ciclosfor

fun main(args: Array<String>){
    val listaDeNombres = listOf<String>("Juan", "Enrique", "Camila")
    println(listaDeNombres )

    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet =  listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor = listaDeNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf { caracteres -> caracteres.length > 3}
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("Nuestro Array $myArray")
    println("Array como lista ${myArray.toList()}")
}