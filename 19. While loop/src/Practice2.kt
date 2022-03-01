/**
 * Ask the user to input an integer.
 * Calculate the factorial of that integer
 * the factorial of a number is: 1 * 2 * 3 * n
 */

fun main() {

    println("Input a number")
    var input = readLine()?:""
    var number = input.toInt()
    var factorial = 1L
    var i = 1
//    while (number >= i){
//        result *= i
//        i++
//    }
//    println(result)
    while (i <= number){
        factorial *= i
        i++
    }
    println("$number! = $factorial")
}