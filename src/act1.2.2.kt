fun main(){

    //variable tipo int
    val entero: Int = 14
    //variable tipo double
    val decimal: Double = 8.3


    //operaciones básicas
    val suma = entero + decimal
    val resta = entero - decimal
    val multiplicacion = entero * decimal
    val division = entero / decimal

    //impresión de resultados
    println("El resultado de la suma es: $suma" +
            "El resultado de la resta es : $resta" +
            "El resultado de la multiplicación es: $multiplicacion" +
            "El resultado de la división es: $division")


    //Seguridad ante nulos
    val nombre: String? = null
    println("Safe Call")
    println(nombre?.length)

    //En Java debería realizarse una verificación con if, no permitiendo acceder al metodo length, por ejemplo, si el valor es null

    //Lógica condicional con when
    val dia: Int = 4

    when (dia){
        1-> println("Lunes")
        2-> println("Martes")
        3-> println("Miércoles")
        4-> println("Jueves")
        5-> println("Viernes")
        6-> println("Sábado")
        7-> println("Domingo")

        else -> println("Error. El número digitado no se encuentra entre el 1 y el 7")
    }

    //Preguntas de reflexión
    //1.- Ambas tienen estructuras similares, pero Kotlin es mas sencillo de utilizar, tiene menos código, el uso de valores nulos es mas sencillo y tambien el where es mas claro de usar que el switch o if de java.
    //2.- La seguridad ante nulos ayudará a evitar errores mientras se programa, y el when será util para trabajar cuando hayan opciones.


}