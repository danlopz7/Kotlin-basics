/**
 * A club has a guesslist. A guest comes and gives their name. (inputs the console)
 * Will the user have access to the club?
 */

fun main() {

    val guessList = arrayListOf("Bob", "Jean", "Sam", "John")
    println("Please enter your name:")
    var name = readLine()?:""
    if(name in guessList){
        println("Welcome to the ceremony Mr. $name ")
    } else{
        println("Not in list")
    }
}