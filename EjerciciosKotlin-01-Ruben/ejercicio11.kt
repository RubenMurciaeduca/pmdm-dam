fun main() {
    print("Introduce la primera nota: ")
    val nota1 = readLine()!!.toDouble()
    print("Introduce la segunda nota: ")
    val nota2 = readLine()!!.toDouble()
    print("Introduce la tercera nota: ")
    val nota3 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3) / 3
    println("Nota media: $media")
    if (media >= 5) {
        println("Aprobado")
    } else {
        println("Suspendido")
    }
}
