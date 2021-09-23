

fun main(arguments: Array<String>){
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa" , "Durazno")

    for (fruta in listaDeFrutas) {
        println("Hoy en el desayuno voy a tener un fruta, que será $fruta")
    }

    listaDeFrutas.forEach { fruta -> println("Imprimiendo desde un forEach, fruta: $fruta")}

    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length}
    println(caracteresDeFruta)
}