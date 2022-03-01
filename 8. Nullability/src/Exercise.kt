fun main() {

    println("Please input a number:")
    var inputNumber = readLine()
    var number = inputNumber?.toDouble()
    number = number?.times(7)
    println("Length of $number is ${number?.toString()?.length}")

    var myString: String? = number?.toString()
    println(myString?.length)
}