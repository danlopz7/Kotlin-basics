/**
 * Create a function that takes a message and prints out the size of the message.
 * Overload the function to take an integer, and print out a string of the size of that integer.
 */

fun main() {
    takingMessage("hello world")
    takingMessage(5)
}

fun takingMessage(message: String){
    println("$message has a size ${message.length}")
}

fun takingMessage(size: Int){
    var message = ""
    for (i in 1.. size){
        message += 'A'
    }
    println("A message of size $size is $message")
}