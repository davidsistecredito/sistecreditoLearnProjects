
// Declaramos los valores de nuestras respuestas
const val affirmativeAnswer = "✅"
const val negativeAnswer = "❌"
const val questionableAnswer = "?"

//Unimos las respuestas con los valores
val answers = mapOf(
    "Sí" to affirmativeAnswer,
    "Es cierto" to affirmativeAnswer,
    "Totalmente" to affirmativeAnswer,
    "Sin duda" to affirmativeAnswer,
    "Pregunta en otro momento" to questionableAnswer,
    "No puedo decirte en este momento" to questionableAnswer,
    "Puede que si o puede que no" to questionableAnswer,
    "No va a suceder" to negativeAnswer,
    "No cuentes con ello" to negativeAnswer,
    "Definitivamente no" to negativeAnswer,
    "No lo creo" to negativeAnswer,
)

fun main() {
    // Declarar el mensaje de entrada del programa
    println("""
        Hello, I'm the Kotlin 8 ball. What do you want to do?
        1. Ask something
        2. Check answers
        3. Exit
    """.trimIndent())

    // Obtener el valor del usuario y convertirlo a un entero nullable
    val input = readLine()

    // Dependiendo del numero utilizamos el when para realizar una acción.
    when (input){
        "1" -> askSomething()
        "2" -> showAnswers()
        "3" -> exit()
        else -> showError()
    }

}

//Mostramos un error por pantalla
fun showError() {
    println("Oops! It seems that you have chosen an invalid option, try again.")
}

//Mostramos un mensaje de despedida por pantalla
fun exit() {
    println("¡Good bye!")
}

//Mostramos un menu para seleccionar una de las opciones al usuario
fun showAnswers() {
    println(""""Select an option:
    1. Check all responses.
    2. Check only affirmative answers.
    3. Check only questionable answers.
    4. Check only negative answers. """.trimIndent())

    val inputOption = readLine()?.toInt()
    when(inputOption){
        1 ->  showAnswerForType()
        2 -> showAnswerForType(answerType = affirmativeAnswer)
        3 -> showAnswerForType(answerType = questionableAnswer)
        4 -> showAnswerForType(answerType = negativeAnswer)
        else -> println("Invalid answer, good bye.")
    }

}

// Mostramos las respuestas dependiendo del tipo que se pase como parametro
fun showAnswerForType(answerType : String = "Alls") {
    when (answerType){
        "Alls" -> answers.keys.forEach { respuesta -> println(respuesta) }
        affirmativeAnswer -> answers.filterValues { values -> values == affirmativeAnswer }
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }

        negativeAnswer -> answers.filterValues { values -> values == negativeAnswer }
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }

        questionableAnswer -> answers.filterValues { values -> values == questionableAnswer }
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }
    }
}

// Preguntamos al usuario que deberiamos mostrarle y le mostramos una respuesta al azar
fun askSomething() {
    println("¿Que preguntas deseas realizar?")
    readLine()
    println("Asi que esa es tu pregunta... La respuesta a eso es:")
    val respuestaGenerada = answers.keys.random()
    println(respuestaGenerada)
}
