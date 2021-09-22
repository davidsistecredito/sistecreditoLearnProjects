package com.sistecredito.fundamentoskotlin

fun main(){
    newTopic("Bucles")
    showPersons("Angel", "Mary", "Fany")                      //TÉRMINOS FIJOS DEL showPersons Uno
    showPersons("Angel", "Mary", "Sergio", "Alex", "Carla")      //TÉRMINOS FIJOS DEL showPersons Dos Y DEL INDEX
}

fun showPersons(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)                             //IMPRIMIR TÉRMINOS FIJOS (BUCLES)
    println(p3)
}

fun showPersons(vararg persons : String){
    newTopic("For")
    for (person in persons) println(person) //IMPRIMIR CON UN FOR

    newTopic("While")
    var index = 0
    while (index < persons.size){
        if (persons[index] == "Mary") println("Es Mary!")
        println(persons[index])   //IMPRIMIR CON UN WHILE
        index++
    }

    newTopic("When")
    index = (0..persons.size-1).random()
    println(index)
    when (persons[index]){
        "Angel" -> println("Es Ángel!")          //IMPRIMIR CON UN WHEN
        "Mary" -> {
            println("Ir a otra pantalla")
            println(2+4)
        }
        else -> println(persons[index])
    }
}