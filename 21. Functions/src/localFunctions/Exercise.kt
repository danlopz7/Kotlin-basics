package localFunctions

/**
 * Create a function that asks the user for a name until an empty string is introduced.
 * Create a local function that takes a name and prints a greeting.
 * For each name introduced, print out a greeting.
 */

fun main() {
    printGreeting()
}

fun printGreeting(){

    fun sayHi(name: String){
        println("Hi $name, how are you?")
    }

    while(true){
        println("Please enter a name:")
        val name = readLine()?:""
        if(name == "") break

        sayHi(name)
    }
}