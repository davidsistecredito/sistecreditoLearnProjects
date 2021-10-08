package com.sistecredito.ciclosfor

import kotlin.concurrent.thread

fun main(args: Array<String>) {
    separator("Lambda Platzi")
    lambdaPlatzi()
    separator("Lambda Maure")
    lambdaMaure()
}

private fun separator(name: String) {
    println("--------- $name --------")
}

private fun lambdaPlatzi() {

    val myLambda: (String) -> Int = { valor -> valor.length }
    println(myLambda("Hola Platzi"))

    val saludos = listOf("Hello", "Hola", "Ciao")
    val longitudDeSaludos = saludos.map(myLambda)
    println(longitudDeSaludos)

}

private fun lambdaMaure() {
    val myIntList = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val myFilterIntList = myIntList.filter { myInt ->
        println(myInt)
        if (myInt == 1) {
            return@filter true
        }
        myInt > 5
    }
    println(myFilterIntList)


    val mySumFun = fun(x: Int, y: Int): Int = x + y
    val myMultFun = fun(x: Int, y: Int): Int = x * y

    myAsyncFun("David"){
        println(it)
    }

    println(myOpertateFun(5, 10, mySumFun))
    println(myOpertateFun(5, 10, myMultFun))
    println(myOpertateFun(5,10){ x, y -> x - y })

}

private fun myOpertateFun(x: Int, y: Int, myFun: (Int, Int) -> Int): Int {
    return myFun(x, y)
}

private fun myAsyncFun(name: String, hello: (String) -> Unit) {
    val myNewString = "Hello $name!"
    thread {
        Thread.sleep(5000)
        hello(myNewString)
    }
}