import java.util.*

fun main() {
    dayOfWeek()
}

fun dayOfWeek() {
    println("what day is it day?")

    val day: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    print( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}