fun main() {
    print("Introduce el día: ")
    val dia = readLine()!!.toInt()
    print("Introduce el mes: ")
    val mes = readLine()!!.toInt()
    print("Introduce el año: ")
    val anio = readLine()!!.toInt()

    if (dia == 25 && mes == 12) {
        println("El $dia/$mes/$anio es Navidad")
    } else {
        println("El $dia/$mes/$anio no es Navidad")
    }
}
