fun main() {
    //create three vars that hold the information
    //print them using print function
    //put the number and text together

    val myName  = "Daniel Fernandez"
    val age = 100
    var myCountry = "Bolivia"

    println("My name is ${myName} and I am ${age} I am from ${myCountry}")

    //myName = "Juan Fernandez" it won't be possible because it is val
    //age = 30 it won't be possible as well because it is val too

    myCountry = "France" // it is possible because it is var

    println("My name is ${myName} and I am ${age} I am from ${myCountry}")

}