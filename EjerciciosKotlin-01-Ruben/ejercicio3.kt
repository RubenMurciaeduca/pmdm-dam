      fun main() {
          print("Introduce la nota (0-10): ")
          val nota = readLine()?.toDoubleOrNull()
      
          if (nota == null || nota !in 0.0..10.0) {
              println("Nota no válida")
              return
          }
      
          val calificacion = when {
              nota < 3 -> "Muy deficiente"
              nota < 5 -> "Insuficiente"
              nota < 6 -> "Suficiente"
              nota < 7 -> "Bien"
              nota < 9 -> "Notable"
              else -> "Sobresaliente"
          }
          println(calificacion)
      }
