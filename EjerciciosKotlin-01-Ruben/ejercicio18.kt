fun main() {
    print("Introduce el primer número: ")
    val numero1 = readLine()!!.toDouble()
    print("Introduce el segundo número: ")
    val numero2 = readLine()!!.toDouble()
    print("Introduce el tercer número: ")
    val numero3 = readLine()!!.toDouble()

    if (numero1 < 10 && numero2 < 10 && numero3 < 10) {
        println("Todos los números son menores a diez")
    } else {
        println("No todos los números son menores a diez")
    }
}
