fun main() {

    // we can omit curly braces if we have only one expression
    var number = 5
    var isEven: String? = null
    if(number % 2 == 0)
        isEven = "Number is even"
    else
        isEven = "Number is odd"

    println(isEven)

    //shorthand if
    // if we only have one expression
    if(number % 2 == 0) isEven = "Number is even" else isEven = "Number is odd"

    // An if statement can return a result as well
    val isEven2 = if(number % 2 == 0) "Number is even" else "Number is odd"
    println(isEven2)
}