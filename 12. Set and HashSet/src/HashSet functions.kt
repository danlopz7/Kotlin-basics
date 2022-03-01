fun main() {

    val numbers = hashSetOf(3, 7, 5, 4)
    val newNumbers = setOf(7, 2, 5, 9, 6)
    println(numbers)
    println(newNumbers)

    // retainAll intersects numbers or common elements on 2 lists
    numbers.retainAll(newNumbers)
    println(numbers)

    numbers.clear()
    println(numbers)


}