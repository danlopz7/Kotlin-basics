fun main() {

    /**
     * Ask the user to input a number. Call it maxValue.
     * Print out every number smaller than maxValue that is divisible by 7, in
     * descending order.
     */

    println("Input a number:")
    var input = readLine()?:""
    var maxValue = input.toInt()
    for (numbers in maxValue downTo 0){
        if(numbers == 0){
            continue
        }
        if(numbers % 7 == 0){
            println(numbers)
        }
    }
}