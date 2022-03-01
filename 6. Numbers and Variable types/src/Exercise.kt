fun main(){

    println("Please input a number: ")
    var numberInput = readLine()?:""
    var num1 = numberInput.toInt()
    var num2 = 30.0

    var num3 = num1*num2

    println("operation $num1 * $num2 = $num3")
    println("the type of the variable returned is: ${num3::class.java}")

}
