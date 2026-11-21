      fun main() {
          print("Introduce el número del DNI: ")
          val numero = readLine()?.toIntOrNull()
      
          if (numero == null || numero !in 0..99999999) {
              println("Número de DNI no válido")
              return
          }
      
          val letras = "TRWAGMYFPDXBNJZSQVHLCKE"
          val letra = letras[numero % 23]
          println("DNI: $numero$letra")
      }
