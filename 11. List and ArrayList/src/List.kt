fun main() {

    // A list is an ordered collection that can contain duplicate elements
    val colors = listOf("Blue", "Red", "Yellow")
    println(colors)

    // If we create an empty list, we must specify the element type
    val colors1 = listOf<String>()
    println(colors1)

    // A list can contain duplicated elements
    val colors3 = listOf("Blue", "Red", "Yellow", "Blue", "Red", "Yellow")
    println(colors3)

    var colors4 = listOf("Blue", "Red", "Yellow", null, null)
    println(colors4)

    println(colors4.size)
}