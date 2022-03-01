/**
 * Create a function that takes a variable number of integers and returns the sum of those integers.
 * Call it several times.
 */

fun main() {
    sumOfIntegers(1, 2, 3)
    sumOfIntegers(36, 25, 7, 9, 32)

}

fun sumOfIntegers(vararg numbers: Int){
    var result = 0
    for(i in numbers){
        result += i
    }
    println(result)
}