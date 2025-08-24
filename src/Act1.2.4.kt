fun main(){

    println("Actividad Ciclos Básicos.")
    println("Ejercicio 1 - Recorrer con for")

    val edades = listOf(23,4, 13,32,57,29)
    var contador = 0

    //listado solo con mayores de 18 años
    for (edad in edades) {
        if (edad >= 18) {
            println("Los mayores de edad tienen: $edad")
        }
    }

    println("Ejercicio 2 - Recorrer con while")

    //listado con while
    while (contador < edades.size) {
        val edad = edades[contador]
        if (edad >= 18) {
            println("Los mayores de edad tienen: $edad")
        }
        contador++
    }

    println("Ejercicio 3 - Recorrer lista completa con while")
    contador = 0
    while (contador < edades.size) {
        println("While -> edad [${contador}] = ${edades[contador]}")
        contador++
    }

    println(edades.joinToString(", "))

    println("Actividad Colecciones")

    val estudiantes = listOf("Efrain", "Ruperto", "Victoria", "Constanza", "Efrain", "Carolina", "Victoria")
    println("Lista de estudiantes completa: $estudiantes")

    println("Ejercicio 1 - Convertido a set para nombres únicos")
    val estudiantesUnicos = estudiantes.toSet()
    println("Lista de estudiantes: $estudiantesUnicos")
    println("Cantidad de nombres únicos: ${estudiantesUnicos.size}")

    println("Ejercicio 2 - Mapa estudiante -> asignatura favorita")
    val asignaturasFavoritas = mapOf(
        "Efrain" to "Programacion",
        "Ruperto" to "Base de Datos",
        "Victoria" to "Algoritmos",
        "Constanza" to "Inteligencia Artificial",
        "Carolina" to "Estadistica"
    )
    println("Estudiante -> Asignatura : $asignaturasFavoritas")

    println("Ejercicio 3 - Asignatura favorita por estudiante")
    val estudianteExistente = "Victoria"
    val estudianteNoExistente = "Marcela"

    println("La asignatura favorita de $estudianteExistente es: ${asignaturasFavoritas[estudianteExistente]}")
    println("La asignatura favorita de $estudianteNoExistente es: ${asignaturasFavoritas[estudianteNoExistente] ?: "No encontrado"}")

    println("Actividad Operaciones con Colecciones")
    println("Ejercicio 1")
    val primerMayor18 = edades.find { it > 18}
    println("Primera edad mayor a 18: $primerMayor18")

    println("Ejercicio 2")
    val hayMenores = edades.any { it < 18}
    println("Hay menores de 18: $hayMenores")

    println("Ejercicio 3")
    val todosAdultos = edades.all { it >= 18}
    println("Todos son adultos: $todosAdultos")

    println("Ejercicio 4")
    val edadesDobles = edades.map { it * 2}
    println("Edades multiplicadas por 2: $edadesDobles")

    println("Ejercicio 5")
    val mayoresDeEdad = edades.filter { it >= 18 }
    println("Mayores de edad: $mayoresDeEdad")

    println("Ejercicio 6")
    val suma = edades.sum()
    val promedio = edades.average()
    println("Suma total de edades : $suma")
    println("Promedio de edades : $promedio")

}






