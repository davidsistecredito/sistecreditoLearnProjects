package com.sistecredito.ciclosfor

fun main (args: Array<String>){
    imprimirNombre(nombre = "David",  apellido = "Londono") //prueba de parámetro nombrados (Kotlin los nombra automaticamente)

}

fun imprimirNombre(nombre:String, segundoNombre:String = "", apellido:String) {
    println("Mi nombre es $nombre y mi apellido es $apellido")
    println("Mi nombre completo es $nombre $segundoNombre $apellido")
}
