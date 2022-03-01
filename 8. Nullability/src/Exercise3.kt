fun main() {

    var product = 29.99
    println("How many products would you like to buy?")
    var input = readLine()
    var quantity = input?.toInt()?:1

    println("Your total purchase is: ${quantity * product}")
}