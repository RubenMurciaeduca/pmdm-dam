fun main() {
    print("Introduce el modelo del coche: ")
    val modelo = (readLine() ?: "").trim().lowercase()

    val descuento = when (modelo) {
        "ford fiesta" -> 5
        "ford focus" -> 10
        else -> null
    }

    if (descuento == null) {
        println("No hay descuento para ese modelo")
    } else {
        println("Descuento: $descuento%")
    }
}
