fun main() {

    val r = 10
    println("A circle with a radius of $r has an area of ${calculateCircleArea(r)}")

    //personalisedGreeting("Alice")
    println(personalisedGreeting("Alice"))

    val clients = listOf("Anna", "Bob", "William")
    for (client in clients){
        val greeting = personalisedGreeting(client)
        println(greeting)
        //println(personalisedGreeting(client))
    }

}

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}

//shorthand function
fun calculateCircleArea2(radius: Int) = 3.1415 * radius * radius

fun personalisedGreeting(person: String): String {
    val greeting = when (person[0]) {
        'A' -> "Are you ok? $person"
        'W' -> "What's up? $person"
        else -> "Hi $person"
    }
    return greeting
}