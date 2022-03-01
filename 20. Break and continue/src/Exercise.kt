/**
 * A group of young people are going to a nightclub
 * Design a program that accepts user ages.
 * The program displays a welcome message for each user.
 * If it receives an age lower than 18, it prints a message that this client is not allowed.
 * If it receives the word "stop", the program ends
 */

fun main() {

//    do {
//        println("ENTER YOUR AGE:")
//        var input = readLine()?:""
//        if(input == "stop")
//            break
//        var age = input.toInt()
//        if(age > 18){
//            println("Welcome to the club")
//        } else
//            println("Sorry, you cannot go in")
//
//    }while (true)

    while (true){
        println("Please enter your age:")
        val input = readLine()?:""
        if(input == "stop") break

        val age = input.toInt()
        if(age < 18){
            println("Sorry you cannot go in")
            continue
        }
        println("Welcome to the club")
    }
}