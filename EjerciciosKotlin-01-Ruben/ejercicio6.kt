fun main() {
    print("Introduce una fruta: ")
    val fruits = readLine() ?: ""

    when (fruits) {
        "banana" -> println("Hello")
        "apple" -> println("Welcome")
    }
}
