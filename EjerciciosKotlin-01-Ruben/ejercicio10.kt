fun main() {
    print("Introduce el primer número: ")
    val numero1 = readLine()!!.toDouble()
    print("Introduce el segundo número: ")
    val numero2 = readLine()!!.toDouble()

    println("Multiplicación: ${numero1 * numero2}")
    if (numero2 != 0.0) {
        println("División: ${numero1 / numero2}")
    } else {
        println("No se puede dividir entre cero")
    }
}
