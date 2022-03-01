/**
 * Create a higher order function that takes a mutable collection of Integers and a lambda function.
 * It then applies the lambda function to every even element of that collection.
 * Create a lambda function that when applies to an integer, it returns that integer divided by 10.
 * Call the HOF using your lambda and display the result
 */

fun main() {

    var numbers = mutableListOf(10, 20, 30, 40, 50)
    println(numbers)

    val myLambda = { number: Int -> number / 10 }
    update(numbers, myLambda)
    println(numbers)

    numbers = mutableListOf(10, 20, 30, 40, 50)
    val newNumbers = update(numbers){ number -> number / 10}
    println(newNumbers)
}

fun update(integers: MutableList<Int>, lambda: (Int) -> Int): MutableList<Int> {
    for (i in 0 until integers.size) {
        if (integers[i] % 2 == 0) {
            integers[i] = lambda(integers[i])
        }
    }
    return integers
}