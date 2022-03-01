/**
 * Given a collection of random integers.
 * If a number is odd, double it.
 * If a number is even, half it.
 * Print out a subset of the collection that has numbers greater than 25.
 */

fun main() {
    val numbers = listOf(5, 57, 9, 12, 27, 40, 68)
    val myLambda = {number: Int -> if (number%2 == 0) number/2 else number*2 }
    //mutateNumbers(numbers, myLambda)
    println(mutateNumbers(numbers, myLambda))
    println(numbers.filter { it > 25 })

    println(numbers)
    val subset = numbers.map {
        if (it % 2 == 0)
            it / 2
        else
            it * 2
    }
        .filter { it > 25 }
    println("lista modificada\n$subset")
}

fun mutateNumbers(numbers: Collection<Int>, lambda: (Int) -> Int): MutableList<Int> {
    var changedList = mutableListOf<Int>()
    for (i in numbers)
        changedList.add(lambda(i))
    return changedList
}