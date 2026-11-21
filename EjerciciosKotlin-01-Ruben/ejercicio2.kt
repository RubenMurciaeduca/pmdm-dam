fun main() {
    print("Introduce un entero entre 0 y 20: ")
    val numero = readLine()?.toIntOrNull()

    if (numero == null || numero !in 0..20) {
        println("Introduce un número válido entre 0 y 20")
        return
    }

    var factorial = 1L
    for (factor in 1..numero) {
        factorial *= factor
    }
    println("$numero! = $factorial")
}
