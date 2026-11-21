fun main() {
    val edades = IntArray(3)
    for (i in edades.indices) {
        print("Introduce la edad ${i + 1}: ")
        edades[i] = readLine()!!.toInt()
    }

    val nombres = Array(3) { i ->
        print("Introduce el nombre ${i + 1}: ")
        readLine()!!
    }

    var indiceMayor = 0
    for (i in 1 until edades.size) {
        if (edades[i] > edades[indiceMayor]) {
            indiceMayor = i
        }
    }
    println("La persona de mayor edad es ${nombres[indiceMayor]}")
}
