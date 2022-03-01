fun main(){
    println("What's your name? :")
    val userName = readLine()
    println("")
    println("How old are you?")
    val userAge = readLine()?:0
    println("Hello $userName, I see your age typed is $userAge")

    println("Enter a number to multiply by")
    val userNumber = readLine()?:""
    val result = userNumber.toInt()*5
    println("$userNumber * 5 = $result")

}