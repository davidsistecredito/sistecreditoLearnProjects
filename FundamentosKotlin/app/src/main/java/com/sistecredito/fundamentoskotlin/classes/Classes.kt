package com.sistecredito.fundamentoskotlin.classes

import com.sistecredito.fundamentoskotlin.newTopic

fun main(){
    newTopic("Classes")
    val phone: Phone = Phone(123456789)
    phone.call()
    phone.showNumber()
    //println(phone.number)

    newTopic("Herencia")
    val smartphone = SmartPhone(34569842, true)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

    newTopic("Data Classes")
    val myUser = User(0,"David", "Londono", 0)

    println(myUser.component3())
    println(myUser)

}