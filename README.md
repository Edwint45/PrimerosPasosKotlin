# Guía Completa de Conceptos Básicos de Kotlin 🦾

Bienvenido al repositorio **PrimerosPasosKotlin**. Esta guía está diseñada para ofrecerte una explicación detallada y profunda de los conceptos fundamentales de Kotlin, acompañada de ejemplos, gráficos y referencias visuales para facilitar tu aprendizaje.

---

## 1. Variables y Tipos de Datos 📦

### ¿Qué es una variable?

Una **variable** es un espacio en memoria que almacena un valor que puede cambiar durante la ejecución del programa. En Kotlin, hay dos formas principales de declarar variables:

- **`val`**: Variable de solo lectura (constante). Su valor no puede cambiar una vez asignado.
- **`var`**: Variable mutable. Su valor puede cambiar.

**Ejemplo:**
```kotlin
val pi: Double = 3.1416 // No puede cambiar
var contador: Int = 0   // Puede cambiar
contador = 5            // Ahora contador vale 5
```

### Tipos de datos primitivos

- **Int**: Números enteros (`val edad: Int = 30`)
- **Double/Float**: Números decimales (`val precio: Double = 19.99`)
- **Boolean**: Verdadero o falso (`val esActivo: Boolean = true`)
- **Char**: Un solo carácter (`val inicial: Char = 'A'`)
- **String**: Cadena de texto (`val nombre: String = "Ana"`)

**Gráfico:**  
```
┌───────────┬───────────┬─────────────┐
│  Nombre   │  Tipo     │  Valor      │
├───────────┼───────────┼─────────────┤
│  pi       │  Double   │  3.1416     │
│  edad     │  Int      │  30         │
│  inicial  │  Char     │  'A'        │
└───────────┴───────────┴─────────────┘
```

### Inferencia de tipos

Kotlin puede **inferir** el tipo de dato automáticamente, aunque es recomendable especificarlo para mayor claridad.

```kotlin
val mensaje = "Hola" // Kotlin infiere que es String
```
---

## 2. Estructuras de Control de Flujo 🔀

### Condicionales

#### If / Else

Permite ejecutar código dependiendo de si se cumple una condición.

```kotlin
val edad = 18
if (edad >= 18) {
    println("Mayor de edad")
} else {
    println("Menor de edad")
}
```

#### When

Similar a `switch` en otros lenguajes, pero más poderoso.

```kotlin
val nota = 8
val resultado = when (nota) {
    10 -> "Sobresaliente"
    in 8..9 -> "Notable"
    in 5..7 -> "Aprobado"
    else -> "Suspenso"
}
println(resultado)
```

**Gráfica de flujo condicional:**
```
[Edad >= 18] --Sí--> [Mayor de edad]
        |
        No
        v
[Menor de edad]
```

### Bucles y Repeticiones

#### For

Itera sobre rangos, arreglos o listas.

```kotlin
for (i in 1..5) {
    println(i)
}
```

#### While y Do-While

Ejecutan código mientras una condición sea verdadera.

```kotlin
var i = 3
while (i > 0) {
    println(i)
    i--
}
```
```kotlin
var j = 0
do {
    println(j)
    j++
} while (j < 3)
```

**Gráfico:**  
```
[Inicio] → [Condición] → [Acción] → [Repetir si condición]
```

---

## 3. Funciones 🛠️

Las **funciones** permiten agrupar código reutilizable y facilitar la lógica del programa.

### Declaración y uso básico

```kotlin
fun saludar(nombre: String) {
    println("Hola, $nombre")
}
saludar("Ana")
```

### Funciones con retorno

```kotlin
fun cuadrado(x: Int): Int {
    return x * x
}
val resultado = cuadrado(4) // 16
```

### Parámetros opcionales y valores por defecto

```kotlin
fun mostrarMensaje(mensaje: String = "Hola mundo") {
    println(mensaje)
}
mostrarMensaje() // Imprime "Hola mundo"
```

### Funciones lambda y funciones como parámetro

Las **lambdas** son funciones anónimas que se pueden pasar como parámetros.

```kotlin
val suma = { a: Int, b: Int -> a + b }
println(suma(3, 5)) // 8

fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}
println(operar(2, 3, suma))
```

**Gráfico:**  
```
[Función] → [Entrada] → [Procesamiento] → [Salida]
```

---

## 4. Colecciones: Arrays y Listas 📚

### Arrays

Estructura de tamaño fijo que almacena elementos del mismo tipo.

```kotlin
val numeros = arrayOf(1, 2, 3)
numeros[0] = 10
println(numeros.joinToString()) // 10, 2, 3
```

### Listas

- **List (inmutable)**: No se puede modificar después de crearla.
- **MutableList**: Puede modificarse.

```kotlin
val lista = listOf("Manzana", "Banana")
val listaMutable = mutableListOf("Rojo", "Verde")
listaMutable.add("Azul")
println(listaMutable) // [Rojo, Verde, Azul]
```

#### Recorrer colecciones

```kotlin
for (fruta in lista) {
    println(fruta)
}
```

**Gráfico:**  
```
[Elemento1] → [Elemento2] → [Elemento3]
```

---

## 5. Mapas (Diccionarios) 🔑

Permiten almacenar pares clave-valor.

### Declaración y uso

```kotlin
val telefonos = mapOf("Ana" to "12345", "Luis" to "67890")
println(telefonos["Ana"]) // 12345

val mutableMap = mutableMapOf("A" to 1)
mutableMap["B"] = 2
```

### Recorrido

```kotlin
for ((clave, valor) in telefonos) {
    println("$clave: $valor")
}
```

**Gráfico:**  
```
[Clave] → [Valor]
["Ana"] → ["12345"]
["Luis"] → ["67890"]
```

---

## 6. Clases y Objetos 👤

Kotlin es orientado a objetos, lo que permite definir tipos personalizados con propiedades y métodos.

### Definición de clase

```kotlin
class Persona(val nombre: String, var edad: Int) {
    fun saludar() {
        println("Hola, soy $nombre y tengo $edad años")
    }
}
```

### Instanciación y uso

```kotlin
val persona = Persona("Ana", 25)
persona.saludar()
```

### Propiedades y Métodos

- **Propiedades:** Variables internas de la clase.
- **Métodos:** Funciones internas que definen el comportamiento.

### Clases de datos (`data class`)

Especiales para almacenar datos.

```kotlin
data class Libro(val titulo: String, val autor: String)
val libro = Libro("Kotlin Básico", "Juan")
println(libro.titulo)
```

**Gráfico:**  
```
┌─────────────┐
│  Persona    │
├─────────────┤
│ nombre      │
│ edad        │
│ saludar()   │
└─────────────┘
```

---

## 7. Nulabilidad y Seguridad 🚦

Kotlin ayuda a evitar errores comunes con valores nulos (`NullPointerException`).

### Tipos anulables

Se indica con `?` tras el tipo.

```kotlin
var apellido: String? = null
```

### Operador seguro (`?.`)

Permite acceder a propiedades solo si no es nulo.

```kotlin
println(apellido?.length) // Imprime null si apellido es null
```

### Operador Elvis (`?:`)

Proporciona un valor alternativo si es nulo.

```kotlin
val largo = apellido?.length ?: 0 // Si apellido es null, largo será 0
```

**Gráfico:**  
```
[Variable?] --nulo--> [Valor alternativo]
       |
    no nulo
       v
[Acceso normal]
```

---

## 8. Operadores Básicos ⚙️

### Aritméticos

- Suma: `+`
- Resta: `-`
- Multiplicación: `*`
- División: `/`
- Módulo: `%`

```kotlin
val suma = 3 + 2 // 5
val resto = 10 % 3 // 1
```

### Comparación

- Igualdad: `==` (valor), `===` (referencia)
- Desigualdad: `!=`
- Mayor, menor: `<`, `>`, `<=`, `>=`

### Lógicos

- Y: `&&`
- O: `||`
- Negación: `!`

```kotlin
val esAdulto = edad >= 18 && edad < 100
```

---

## 9. Comentarios y Documentación 📝

Los comentarios ayudan a explicar el código.

- **Comentario de línea:** `// Esto es un comentario`
- **Comentario de bloque:**  
```kotlin
/*
   Comentario
   de bloque
*/
```

- **KDoc (documentación para funciones y clases):**
```kotlin
/**
 * Suma dos números enteros.
 */
fun sumar(a: Int, b: Int): Int = a + b
```

---

## 10. Recursos Visuales y Prácticos 🖼️

- Utiliza [Kotlin Playground](https://play.kotlinlang.org/) para practicar.
- Consulta la [Documentación Oficial de Kotlin](https://kotlinlang.org/docs/home.html).
- Busca iconos en [Material Icons](https://fonts.google.com/icons).

---

## Referencias

- [Guía oficial de Kotlin](https://kotlinlang.org/docs/home.html)
- [Kotlin para Android](https://developer.android.com/kotlin)
- [Playground interactivo](https://play.kotlinlang.org/)

---

> _Esta guía te dará una base sólida para empezar a escribir código en Kotlin, comprender sus conceptos y aplicarlos en tus proyectos. ¡Explora y experimenta!_
