package com.sistecredito.ciclosfor

fun main(args: Array<String>) {
    separador(" high Order by Giuseppe")

    val largoDelValorInicial = superFuncion(valorInicial = "Hola!") { valor ->
        valor.length
    }
    println(largoDelValorInicial)

    val lambda = funcionInception("Enrique")
    val valorLambda: String = lambda()
    println(valorLambda)

    /* high Order by Anahí Salgado*/
    separador("high Order by Anahí")

}

fun separador(name: String) {
    println("\n---------- $name ----------")
}


fun superFuncion(valorInicial: String, block: (String) -> Int): Int {
    return block(valorInicial)
}

fun funcionInception(nombre: String): () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}

