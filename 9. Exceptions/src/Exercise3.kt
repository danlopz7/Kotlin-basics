import java.lang.Exception

/**
 * Exercise: Try catch finally
A customer will tell the program what product they want to buy.

Then, they will tell the program how many products they require.

Assume the price of the product is 9.99

What is the total?

Handle any exceptions that might occur.
 */

fun main() {

    println("Enter the product you want to buy: ")
    var product = readLine()

    println("Enter how many products would you like: ")
    val input = readLine()

    val productPrice = 9.99
    var productsAmount: Int?

    try {
        productsAmount = input?.toInt()
        println("$productsAmount of $product is: ${productsAmount?.times(productPrice)}")

    } catch (e: Exception){
        println("Cannot read amount")
        println("An error ocurred ${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Code executed")
    }

}