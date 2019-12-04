fun main(args: Array<String>) {

    val hour = args[0].toInt()
    println("Good ${if (hour < 12) "morning, " else "night,"} Kotlin!")
}