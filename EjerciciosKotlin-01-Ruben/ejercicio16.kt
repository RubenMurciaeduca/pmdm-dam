fun main() {
    print("Introduce la clave: ")
    val clave1 = readLine() ?: ""
    print("Repite la clave: ")
    val clave2 = readLine() ?: ""

    if (clave1 == clave2) {
        println("Las claves son iguales")
    } else {
        println("Las claves no son iguales")
    }
}
