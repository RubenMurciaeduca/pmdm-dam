fun main() {
    print("Introduce una palabra (casa, mesa, perro o gato): ")
    val palabra = (readLine() ?: "").trim().lowercase()

    val traduccion = when (palabra) {
        "casa" -> "house"
        "mesa" -> "table"
        "perro" -> "dog"
        "gato" -> "cat"
        else -> null
    }

    if (traduccion == null) {
        println("Palabra no válida")
    } else {
        println(traduccion)
    }
}
