fun main() {

    // List functions exercises
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")
    println("Michael finished on position ${winners.indexOf("Michael") + 1}")

    /**
     * A printer needs the colors red, green and blue to print.
     * A printer on your desk has the following colors available: red and blue
     * Design a program that prints out a boolean value, on whether the printer can print
     */

    val requiredColors = listOf("red", "green", "blue")
    val availableColors = listOf("red", "blue")
    println("Can print: ${availableColors.containsAll(requiredColors)}")

    /**
     * A recipe calls for the following ingredients:
     * Chicken, egg, Mozarella, Pepper
     * You decide to replace the mozarella with blue cheese
     * print out the list of ingredients
     */

    val ingredients = arrayListOf("Chicken", "egg", "Mozarella", "Pepper")
    ingredients.set(ingredients.indexOf("Mozarella"), "Blue Cheese")
    //ingredients.set(2, "Blue Cheese")
    println(ingredients)

    /**
     * A zoo has a list of animals: lion, zebra, chimp, elephant
     * A new panda bear has arrived. Print out the new list of animals
     * The lion has been sold to a different zoo.
     * Print out the new list of animals
     * Does the zoo have both elephants and giraffes?
     */

    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda bear")
    println(animals)
    //animals.removeAt(0)
    
    animals.remove("lion")
    println(animals)

    val subList = listOf("elephant", "giraffe")
    println("Does the zoo have both elephants and giraffes? : ${animals.containsAll(subList)}")
}