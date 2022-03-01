/**
 * Ask the user to input a number multiple times, until they input a number larger than 100.
 */

fun main() {
    var flag = false
    do{
        println("Input a number:")
        var input = readLine()?:""
        var number = input.toInt()
        if(number > 100){
            println("Thanks")
            flag = true
        } else{
            println("$number is not greater than 100. Please try again")
        }
    }while (!flag)
}