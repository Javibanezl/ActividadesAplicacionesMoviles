fun main(){

    val edades = listOf(23,4, 13,32,57,29)
    var contador = 0

    //listado solo con mayores de 18 años
    for (edad in edades) {
        if (edad >= 18) {
            println("Los mayores de edad tienen: $edad")
        }
    }

    //listado con while
    while (contador < edades.size) {
        val edad = edades[contador]
        if (edad >= 18) {
            println("Los mayores de edad tienen: $edad")
        }
        contador++
    }




}