/**
 * Ask the user to input a large integer.
 * Print out all the numbers that are divisible by 7, that are less than the user's number.
 */

fun main() {

    println("Input a number:")
    var input = readLine()?:""
    var number = input.toInt()

    var i = 0
//    while (i < number){
//        if (i % 7 == 0){
//            println("$i is divisible by 7")
//        }
//        i++
//    }
    while(number >= i){
        if(number % 7 == 0){
            println(number)
        }
        number--
    }
}