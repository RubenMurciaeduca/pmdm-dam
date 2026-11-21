fun main() {
    print("Introduce el primer número: ")
    val numero1 = readLine()!!.toInt()
    print("Introduce el segundo número: ")
    val numero2 = readLine()!!.toInt()
    print("Introduce el tercer número: ")
    val numero3 = readLine()!!.toInt()
    print("Introduce el cuarto número: ")
    val numero4 = readLine()!!.toInt()

    println("Suma de los dos primeros: ${numero1 + numero2}")
    println("Producto de los dos últimos: ${numero3 * numero4}")
}
