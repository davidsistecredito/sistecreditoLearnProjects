package com.sistecredito.ciclosfor

fun main (args: Array<String>){
    val fraseAleatoria = "En Platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)
}


fun imprimirFrase(frase: String) : Unit {
    println("Tu frase es: $frase")
}


fun String.randomCase(): String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){  //rem es usado para extraer el residuo de una división.
        this.uppercase()
    } else {
        this.lowercase()
    }
}



/* fun randomCase (frase : String) : String { //normal function for natural invocation.
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){  //rem es usado para extraer el residuo de una división.
        frase.uppercase()
    } else {
        frase.lowercase()
    }
} */