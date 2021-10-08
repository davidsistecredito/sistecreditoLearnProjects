package com.sistecredito.ciclosfor

fun main (args: Array<String>){

    val numeroDeLoteria = listOf(11,22,43,56,78,66)

    val numerosSorted = numeroDeLoteria.sorted()

    println(numerosSorted)

    val numerosDeLoteriaDescendientes = numeroDeLoteria.sortedDescending()
    println(numerosDeLoteriaDescendientes)

    val ordenarPorMultiplos = numeroDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarPorMultiplos)

    val numerosAleatorios = numeroDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosEnReversa = numeroDeLoteria.reversed()
    println(numerosEnReversa)

    val mensajesDeNumeros = numeroDeLoteria.map { numero -> "Tu número de lotería es $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numeroDeLoteria.filter { numero -> numero > 50 }
    println(numerosFiltrados)

}