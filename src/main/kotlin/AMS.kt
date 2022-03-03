

fun main(args: Array<String>){
    println("Hello ${args[0]}")

    val isUnit = println("This is an Expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are a ${ if (temperature > 50)"fried" else "safe"} fish"
    println(message)
}