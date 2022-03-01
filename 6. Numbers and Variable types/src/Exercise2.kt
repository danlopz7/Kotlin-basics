fun main(){

    println("Please enter a double number: ")
    val inputNumber = readLine()?:"0"

    val num1 = inputNumber.toDouble()
    var pi = 4.14159
    val num2 = num1 * pi

    println("$num2 is of type ${num2::class.java}")
}