package com.sistecredito.ciclosfor

//const tiempo de compilación
const val N = "NAME" //variables de manera global
var n = 3 //mala práctica de programación, tratar de no usar var
val n2 = "n" //variable local ejecución

//Funciones Puras


fun main(args: Array<String>) {
    separador("Ejemplo Var Val y Const")

    n = 4
    println(n)


}
