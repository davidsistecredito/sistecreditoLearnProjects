package com.sistecredito.ciclosfor


fun main(){

    try {
        var i=10/10
        println(i)
    } catch (e: Exception)
    {
        println("Error " +e)
    } finally {
        println("Finaliza flujo")
    }
}
