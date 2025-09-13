package com.example.primerospasoskotlin

fun main(){
// Tipo de Dato Booleano (Boolean) en Kotlin

// 1. Definición:
// El tipo `Boolean` en Kotlin representa un valor lógico.
// Solo puede tener uno de dos valores posibles: `true` (verdadero) o `false` (falso).
// Es fundamental para la toma de decisiones y el control de flujo en los programas.

// 2. Declaración e Inicialización:
// Se puede declarar una variable de tipo Boolean explícitamente:
    val esKotlinDivertido: Boolean = true
    val esJavaAntiguo: Boolean = false

    println("es Kotlin Divertido "+esKotlinDivertido)

    println("es Java Antiguo "+esJavaAntiguo)

    // Tipos de Datos Numéricos en Kotlin

    // Kotlin ofrece varios tipos de datos para representar números.
    // Se dividen principalmente en dos categorías: tipos para números enteros y tipos para números con decimales.

    // --- 1. Tipos para Números Enteros ---
    // Estos tipos almacenan números sin parte fraccionaria (sin decimales).
    // La elección del tipo depende del rango de valores que necesites almacenar y la memoria que quieras utilizar.

    // a) Byte:
    //    - Rango: -128 a 127 (ocupa 8 bits de memoria).
    //    - Útil para ahorrar memoria cuando sabes que el número será muy pequeño.
    val edadMascota: Byte = 5 // Ejemplo: la edad de una mascota rara vez superará los 127 años.
    println("Edad de la mascota (Byte): $edadMascota")

    // b) Short:
    //    - Rango: -32,768 a 32,767 (ocupa 16 bits de memoria).
    //    - Para números enteros un poco más grandes que Byte, pero aún relativamente pequeños.
    val anioDeNacimientoCorto: Short = 1995 // Ejemplo: un año.
    println("Año de nacimiento (Short): $anioDeNacimientoCorto")

    // c) Int (Integer):
    //    - Rango: -2,147,483,648 a 2,147,483,647 (ocupa 32 bits de memoria).
    //    - Es el tipo de dato entero más comúnmente utilizado por defecto en Kotlin.
    //    - Si declaras un número entero sin especificar el tipo, Kotlin generalmente lo infiere como `Int`.
    val numeroDeEstudiantes: Int = 2500
    val golesEnUnPartido = 3 // Kotlin infiere esto como Int
    println("Número de estudiantes (Int): $numeroDeEstudiantes")
    println("Goles en un partido (Int inferido): $golesEnUnPartido")

    // d) Long:
    //    - Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 (ocupa 64 bits de memoria).
    //    - Se usa para números enteros muy grandes que no caben en un `Int`.
    //    - Para especificar explícitamente que un número es `Long`, se le añade una `L` al final.
    val poblacionMundial: Long = 8000000000L // La 'L' indica que es un Long.
    val numeroMuyGrande = 3000000000 // Kotlin puede inferir Long si el número excede el rango de Int.
    println("Población mundial (Long): $poblacionMundial")
    println("Número muy grande (Long inferido): $numeroMuyGrande")


    // --- 2. Tipos para Números con Decimales (Punto Flotante) ---
    // Estos tipos almacenan números que pueden tener una parte fraccionaria.

    // a) Float:
    //    - Precisión simple (aproximadamente 6-7 dígitos decimales significativos, ocupa 32 bits).
    //    - Para números con decimales donde no se necesita una precisión extremadamente alta.
    //    - Para especificar que un número con decimales es `Float`, se le añade una `f` o `F` al final.
    val precioProducto: Float = 19.99f // La 'f' indica que es un Float.
    val piAproximado: Float = 3.14159F
    println("Precio del producto (Float): $precioProducto")
    println("Pi aproximado (Float): $piAproximado")

    // b) Double:
    //    - Precisión doble (aproximadamente 15-17 dígitos decimales significativos, ocupa 64 bits).
    //    - Es el tipo de dato para números con decimales más comúnmente utilizado por defecto en Kotlin.
    //    - Ofrece mayor precisión que `Float`.
    //    - Si declaras un número con decimales sin especificar el tipo, Kotlin generalmente lo infiere como `Double`.
    val alturaPersona: Double = 1.75
    val piExacto = 3.141592653589793 // Kotlin infiere esto como Double
    println("Altura de la persona (Double): $alturaPersona")
    println("Pi más exacto (Double inferido): $piExacto")


    // Consideraciones Generales:
    // - Inferencia de Tipo: Kotlin es bueno infiriendo el tipo numérico.
    //   Si escribes `val numero = 10`, Kotlin asume `Int`.
    //   Si escribes `val numeroDecimal = 10.5`, Kotlin asume `Double`.
    // - Especificación Explícita: Puedes especificar el tipo si lo necesitas,
    //   especialmente para `Byte`, `Short`, `Long` (con `L`) y `Float` (con `f` o `F`).
    // - Elección del Tipo: Elige el tipo más pequeño que pueda contener tus datos de forma segura
    //   para optimizar el uso de memoria, aunque para la mayoría de los casos cotidianos,
    //   `Int` para enteros y `Double` para decimales son buenas opciones por defecto.
    // - Kotlin también tiene tipos para enteros sin signo (UInt, ULong, UByte, UShort),
    //   pero son para casos de uso más específicos y no se cubren aquí por simplicidad.





    // Tipos de Datos para Texto en Kotlin

    // Kotlin tiene principalmente dos tipos para manejar texto: Char para un solo carácter
    // y String para secuencias de caracteres (texto completo).

    // --- 1. Char (Carácter) ---
    // Representa un ÚNICO carácter.
    // Se define utilizando comillas SIMPLES (' ').

    // a) Declaración e Inicialización:
    val primeraLetraNombre: Char = 'J' // Almacena la letra 'J'
    val simboloExclamacion: Char = '!'   // Almacena el símbolo '!'
    val digitoComoCaracter: Char = '7'   // Almacena el número '7' pero como un carácter, no como valor numérico

    println("Primera letra del nombre: $primeraLetraNombre")
    println("Símbolo: $simboloExclamacion")
    println("Dígito como carácter: $digitoComoCaracter")

    // Nota: Un Char NO es lo mismo que un String de un solo carácter.
    // val incorrecto: Char = "A" // Esto daría un error, "A" es un String.

    // b) Caracteres Especiales (Secuencias de Escape):
    // Algunos caracteres tienen significados especiales y necesitan ser "escapados" con una barra invertida `\`.
    val nuevaLinea: Char = '\n'       // Representa un salto de línea
    val tabulacion: Char = '\t'       // Representa una tabulación
    val comillaSimpleChar: Char = '\'' // Representa el carácter de comilla simple
    val barraInvertidaChar: Char = '\\' // Representa el carácter de barra invertida

    print("Hola")
    print(nuevaLinea) // Esto hará que el siguiente print aparezca en una nueva línea
    print("Mundo")
    println("") // Salto de línea para separar del siguiente ejemplo
    println("Columna1${tabulacion}Columna2")


    // --- 2. String (Cadena de Caracteres) ---
    // Representa una secuencia de caracteres, es decir, texto.
    // Se define utilizando comillas DOBLES (" ").
    // Los Strings son inmutables en Kotlin, lo que significa que una vez creados, su contenido no puede cambiar.
    // Cualquier operación que parezca modificar un String en realidad crea un nuevo String.

    // a) Declaración e Inicialización:
    val saludo: String = "Hola, Kotlin!"
    val nombreCompleto: String = "Ana López"
    val fraseVacia: String = "" // Un String puede estar vacío
    val parrafo: String = "Este es un párrafo de texto que puede ser más largo."

    println(saludo)
    println("Nombre: $nombreCompleto")
    println("Frase vacía: '$fraseVacia'") // Se verá como ''
    println(parrafo)

    // b) Concatenación de Strings:
    // Se pueden unir Strings usando el operador `+`.
    val parte1: String = "Me gusta programar en "
    val parte2: String = "Kotlin."
    val fraseCompleta: String = parte1 + parte2
    println(fraseCompleta) // Imprime: Me gusta programar en Kotlin.

    // c) Plantillas de String (String Templates):
    // Permiten incrustar variables y expresiones directamente dentro de un String usando el símbolo `$`.
    // Si es una expresión más compleja, se usan llaves `${expresion}`.
    val edad: Int = 30
    val mensajePersonalizado: String = "Mi nombre es $nombreCompleto y tengo $edad años."
    println(mensajePersonalizado) // Imprime: Mi nombre es Ana López y tengo 30 años.

    val precio: Double = 19.99
    val cantidad: Int = 3
    val totalMensaje: String = "El total es: ${precio * cantidad} €" // Expresión dentro de la plantilla
    println(totalMensaje) // Imprime: El total es: 59.97 €

    // d) Strings Multilínea (Raw Strings):
    // Se definen usando triples comillas dobles (`"""`).
    // Permiten escribir texto en múltiples líneas tal como está, incluyendo saltos de línea
    // y caracteres especiales sin necesidad de escaparlos (excepto el propio `"""`).
    val poema: String = """
        En un lugar de la Mancha,
        de cuyo nombre no quiero acordarme,
        no ha mucho tiempo que vivía un hidalgo...
    """.trimIndent() // `.trimIndent()` es útil para quitar la indentación común.

    println(poema)

    // e) Propiedades y Funciones Útiles de los Strings:
    val textoEjemplo: String = "Kotlin es Genial"

    // Longitud del String (número de caracteres)
    println("Longitud de '$textoEjemplo': ${textoEjemplo.length}") // Imprime: Longitud de 'Kotlin es Genial': 16

    // Acceder a un carácter específico (basado en índice, comienza en 0)
    println("Primer carácter: ${textoEjemplo[0]}") // Imprime: Primer carácter: K
    println("Último carácter: ${textoEjemplo[textoEjemplo.length - 1]}") // Imprime: Último carácter: l

    // Convertir a mayúsculas o minúsculas
    println("Mayúsculas: ${textoEjemplo.uppercase()}") // Imprime: Mayúsculas: KOTLIN ES GENIAL
    println("Minúsculas: ${textoEjemplo.lowercase()}") // Imprime: Minúsculas: kotlin es genial

    // Verificar si está vacío
    println("'$fraseVacia' está vacía: ${fraseVacia.isEmpty()}") // Imprime: '' está vacía: true
    println("'$textoEjemplo' está vacío: ${textoEjemplo.isEmpty()}") // Imprime: 'Kotlin es Genial' está vacía: false

    // Hay muchas más funciones útiles para manipular Strings (buscar, reemplazar, dividir, etc.).




    // Tipos de Datos Nulos (Null Safety) en Kotlin

    // 1. ¿Qué es 'null'?
    // 'null' significa "sin valor" o "ausencia de un valor".
    // Es como una caja vacía que no contiene nada.

    // 2. Tipos No Nulables (Por defecto):
    // En Kotlin, las variables normalmente NO PUEDEN ser 'null'.
    // Esto ayuda a evitar errores comunes llamados "NullPointerExceptions".
    var textoNormal: String = "Hola"
    // textoNormal = null // Esto daría un ERROR de compilación. ¡Kotlin te protege!

    // 3. Tipos Nulables (Permitir 'null'):
    // Si realmente necesitas que una variable pueda ser 'null', debes indicarlo
    // añadiendo un signo de interrogación `?` después del tipo.
    var textoNulable: String? = "Kotlin"
    println("Texto nulable: $textoNulable") // Imprime: Texto nulable: Kotlin

    textoNulable = null // ¡Esto SÍ es permitido! La variable puede estar "vacía".
    println("Texto nulable ahora: $textoNulable") // Imprime: Texto nulable ahora: null

    var numeroNulable: Int? = 10
    numeroNulable = null




    /*Operador Elvis l operador Elvis (?:) en Kotlin se usa para proporcionar
    un valor predeterminado si una expresión resulta ser null.*/
    val nombre: String? = null // 'nombre' podría ser null
    val nombreAMostrar: String = nombre ?: "Invitado" // Si 'nombre' es null, usa "Invitado"

    println(nombreAMostrar) // Imprime: Invitado

    val edad2: Int? = 30
    val edadParaUsar: Int = edad2 ?: 0 // Si 'edad' es null, usa 0

    println(edadParaUsar) // Imprime: 30

}