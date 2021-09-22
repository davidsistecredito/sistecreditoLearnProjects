package com.sistecredito.fundamentoskotlin.classes

open class Phone(protected val number: Int) {

    fun call(){
        println("Llamando...")
    }

    open fun showNumber(){
        println("Mi número es: $number")
    }
}