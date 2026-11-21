fun main() {
    print("Introduce el precio del artículo (entero): ")
    val precio = readLine()!!.toInt()
    print("Introduce la cantidad: ")
    val cantidad = readLine()!!.toInt()

    val total = precio * cantidad
    println("Total a pagar: $total")
}
