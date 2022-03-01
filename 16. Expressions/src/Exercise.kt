import java.lang.Exception

/**
 * Ask a user to input their age
 * If they are under 13, they are a child
 * If they are under 18, they are teen
 * If they are older, they are adults.
 * Use ranges to print out the correct message
 * If the age is 0, convert it to 1.
 */

fun main() {

    println("Enter your age:")
    var input = readLine() ?: "1"
    try {
        var age = input.toInt()
        if (age == 0) age = 1

        var youAre = if (age in 1..13)
            "child"
        else if (age in 14..18)
            "teen"
        else
            "adult"
        println("You are $youAre")
    } catch (e: Exception){
        //e.printStackTrace()
        println("ERROR ${e.localizedMessage}\nPlease enter a number")
    }

}