fun main() {

    /*print("Enter a message: ")
    var message = readLine()
    println(message?:"wassup")*/

    println("Enter a number:")
    var input = readLine()
    var number = input?.toInt()
    println("Number multiplied by five is: ${number!!.times(5)}")
}