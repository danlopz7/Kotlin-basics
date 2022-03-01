/**
 * Create a function that receives the name of an animal, and returns the estimated lifespan.

cats -> 15
dogs -> 10
rabbit -> 12
everything else -> 20

Ask the user to input an animal, then print out the estimated lifespan for that animal.
 */
fun main() {

    println("\"Calculate animal lifespan\" Input an animal of your interest:")
    var input = readLine() ?: ""
    // val lifespan = lifespanAnimal(input)
    println("A $input can live up to ${lifespanAnimal(input)}")
}

fun lifespanAnimal(animal: String): Int {
    val lifespan = when (animal) {
        "cat", "cats" -> 15
        "dog", "dogs" -> 10
        "rabbit" -> 12
        else -> 20
    }
    return lifespan
}