package com.example.primerospasoskotlin

fun main (){
    /*Operador Elvis l operador Elvis (?:) en Kotlin se usa para proporcionar
    un valor predeterminado si una expresión resulta ser null.*/
    val nombre: String? = null // 'nombre' podría ser null
    val nombreAMostrar: String = nombre ?: "Invitado" // Si 'nombre' es null, usa "Invitado"

    println(nombreAMostrar) // Imprime: Invitado

    val edad2: Int? = 30
    val edadParaUsar: Int = edad2 ?: 0 // Si 'edad' es null, usa 0

    println(edadParaUsar) // Imprime: 30

    println("--- Calculadora Sencilla con Operadores Matemáticos ---")

    // Pedimos el primer número al usuario
    print("Ingresa el primer número: ")
    // readLine() lee la línea completa que el usuario escribe como un String (texto).
    // Puede ser null si no hay entrada, por eso usamos `!!` (asumiendo que el usuario siempre escribirá algo)
    // o el operador Elvis `?: "0"` para un valor por defecto.
    // Luego, `.toInt()` convierte ese texto a un número entero (Int).
    val entrada1: String = readLine() ?: "0" // Lee como texto, si es null usa "0"
    val numero1: Int = entrada1.toIntOrNull() ?: 0 // Convierte a Int, si falla usa 0

    // Pedimos el segundo número al usuario
    print("Ingresa el segundo número: ")
    val entrada2: String = readLine() ?: "0"
    val numero2: Int = entrada2.toIntOrNull() ?: 0 // toIntOrNull() es más seguro que toInt()

    println("\n--- Resultados de las Operaciones ---")

    // 1. Suma (+)
    //    Suma los dos números.
    val suma: Int = numero1 + numero2
    println("$numero1 + $numero2 = $suma")

    // 2. Resta (-)
    //    Resta el segundo número del primero.
    val resta: Int = numero1 - numero2
    println("$numero1 - $numero2 = $resta")

    // 3. Multiplicación (*)
    //    Multiplica los dos números.
    val multiplicacion: Int = numero1 * numero2
    println("$numero1 * $numero2 = $multiplicacion")

    // 4. División (/)
    //    Divide el primer número por el segundo.
    //    Si ambos son Int, el resultado es la parte entera.
    if (numero2 != 0) { // Importante: Evitar dividir por cero
        val divisionEntera: Int = numero1 / numero2
        println("$numero1 / $numero2 (entera) = $divisionEntera")

        // Para división con decimales, convertimos uno a Double
        val divisionDecimal: Double = numero1.toDouble() / numero2
        println("$numero1 / $numero2 (decimal) = $divisionDecimal")
    } else {
        println("No se puede dividir por cero.")
    }

    // 5. Módulo (%) o Resto de la División
    //    Da el resto de la división entera.
    if (numero2 != 0) { // Importante: Evitar dividir por cero
        val modulo: Int = numero1 % numero2
        println("$numero1 % $numero2 (resto) = $modulo")
    } else {
        println("No se puede obtener el módulo con divisor cero.")
    }

    // --- Operadores de Incremento y Decremento (aplicados a variables) ---
    // Modifican el valor de una variable.

    println("\n--- Operadores de Incremento y Decremento ---")
    var numeroMod: Int = 5
    println("Número original: $numeroMod")

    // 6. Incremento (++)
    //    Aumenta el valor en 1.
    numeroMod++ // numeroMod ahora es 6
    println("Después de numeroMod++: $numeroMod")

    // 7. Decremento (--)
    //    Disminuye el valor en 1.
    numeroMod-- // numeroMod vuelve a ser 5
    numeroMod-- // numeroMod ahora es 4
    println("Después de dos numeroMod--: $numeroMod")

    // --- Operador Unario Menos (-) ---
    // Cambia el signo de un número.
    val positivo = 10
    val negativo = -positivo // negativo será -10
    println("\n--- Operador Unario Menos ---")
    println("-$positivo = $negativo")
}