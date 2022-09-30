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

fun main(args: Array<String>) {
    println("Hello World!")

    declarationTypesOfVariables()
}