package com.sistecredito.fundamentoskotlin

import kotlin.math.abs

fun main() {
    sayHello()

    newTopic("Argumentos")

    //println(sum(2,3))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a, b)}")
    println("$a + $b = ${sub(a, b)}")

    newTopic("Infix")
    val c = -3
    println(c.enableAbs(false))
    println("$a + $c = ${sum(a, c)}")
    println("$a + $c = ${sum(a, c.enableAbs(true))}")

    newTopic("Sobrecarga")
    showProduct("Soda", "10%")
    showProduct("Pan")
    showProduct("Caramelo", "15%", "21 de marzo")
    showProduct("Jugo", validity = "15 de marzo")

}

private fun sayHello(): Unit {                        //Unit = void en otros lenguajes
    println("Hola Kotlin")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b: Int) = a - b                       //fun de argumentos

infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this                           //infix fun

fun showProduct(name: String, promo: String = "Sin promoción", validity: String = "agotar existencias") {
    println("$name = $promo hasta $validity")                                  //fun de sobrecarga
}