fun main() {
    print("Introduce el sueldo: ")
    val sueldo = readLine()!!.toDouble()
    print("Introduce los años de antigüedad: ")
    val antiguedad = readLine()!!.toInt()

    val sueldoAPagar = when {
        sueldo < 500 && antiguedad >= 10 -> sueldo * 1.20
        sueldo < 500 -> sueldo * 1.05
        else -> sueldo
    }
    println("Sueldo a pagar: $sueldoAPagar")
}
