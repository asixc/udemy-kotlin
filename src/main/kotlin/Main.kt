fun declarationTypesOfVariables(){
    val age: Int = 20
    val altura: Double = 1.80
    val peso: Float = 80.5f
    val esMujer: Boolean = true
    val longValue: Long = 239829384932843928
    println("age" + age)
    println("altura" + altura)
    println("peso" + peso)
    println("es mujer" + esMujer)
    println("long value:" + longValue)

    val name: String = "Jose Alberto"
    println("name: " + name)
    val nameLength: Int = name.length
    println("name length: " + nameLength)
    val nameIsEmpty: Boolean = name.isEmpty()
    println("name is empty:" +nameIsEmpty)
    val nameContains: Boolean = name.contains("Jose")
    println("name contains jose: " + nameContains)

    println("String substring init in 2:" + name.substring(2))

    val myReplace: String = name.replace("e", "o")
    println("name remplaced: " + myReplace)
}

fun contenationStrings() {
    val age: Int = 20
    val altura: Double = 1.90
    val peso: Float = 80.541214f
    val name: String = "Jose Alberto"
    val description: String = "Hola soy $name, tengo $age años y mi altura es de $altura con un peso de $peso"

    // Mostrar por consola básica:
    println(description)

    // Comodines por tipo
    // - String = %s
    // - Enteros = %d
    // - Double = %f
    // - Float = %f
    val description2: String = String.format("Hola soy %s, tengo %d años y mi altura es de %.2f con un peso de %f", name, age, altura, peso)
    println("Description 2:" + description2)
}

fun var_and_val (){
    var name = "jotxee"
    name = "Miriam"
    // al se declarada como var es reasignalbe

    println("Nombre:  $name es igual 'jotxee'? ${name.equals("jotxee")}")
}

fun operacionesNumeros (){
    println("Pi" + kotlin.math.PI)
}

fun usandoWhen () {
    val dayOfWeek = 4

    if (dayOfWeek == 1) {
        println("Dia de la semana 1")
    } else if (dayOfWeek == 2) {
        println("Dia de la semana 2")
    }else if (dayOfWeek == 3) {
        println("Dia de la semana 3")
    }else if (dayOfWeek == 4) {
        println("Dia de la semana 4")
    }else if (dayOfWeek == 5) {
        println("Dia de la semana 5")
    }else if (dayOfWeek == 6) {
        println("Dia de la semana 6")
    }


    when (dayOfWeek) {
        1 -> println("Dia de la semana 1")
        2 -> println("Dia de la semana 2")
        3 -> println("Dia de la semana 3")
        4 -> println("Dia de la semana 4")
        5 -> {
            // si no quiero hacer mas cosas en este case podemos quitar los { }
            println("Dia de la semana 5")
        }
        6 -> println("Dia de la semana 6")
        else -> println("otro dia..")
    }
}
fun main(args: Array<String>) {
    println("Hello World!")

    declarationTypesOfVariables()
    contenationStrings()
    var_and_val()
    operacionesNumeros()
    usandoWhen()
}