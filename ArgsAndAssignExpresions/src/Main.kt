fun main(args: Array<String>) {
    println("Hello ${args[0]}!")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isNot = if (temperature > 50) true else false
    println(isNot)

    val message = "You are ${ if (temperature > 50) "fried" else "safe" } fish"
    println(message)
}