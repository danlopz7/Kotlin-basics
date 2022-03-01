/**
 * An animal shelter is accepting all animals except snakes.
 * A user is allowed to bring 5 animals to the shelter.
 * Ask the user to input the animals they want to bring.
 * If they bring a snake, print a message and stop accepting animals.
 */
fun main() {

    var animals = arrayListOf<String>()
    println("What animals would you like to bring to the shelter?:")
    for (i in 1..5) {
        print("$i. ")
        var input = readLine() ?: ""
        if (input == "snake") {
            println("Sorry, our shelter is not accepting snakes")
            break
        }
        animals.add(input)
        //println()
    }
    println(animals)
}