/**
 * Ask the user to input a number
 * If the factorial of that number is less than 3,000,000, ask them to input another number and repeat the process.
 */

fun main() {
    var flag = false
    do{
        println("Input a number in order to calculate factorial:")
        var input = readLine()?:""
        var number = input.toInt()

        var factorial = 1L
        var i = 1
        while (number >= i){
            factorial *= i
            i++
        }
        if(factorial < 3000000) {
            println("$number! = $factorial is smaller than 3.000.000. Please try again")
        } else{
            println("$number! = $factorial")
            flag = true
        }
    } while (!flag)
}