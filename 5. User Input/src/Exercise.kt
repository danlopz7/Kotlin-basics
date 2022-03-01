fun main(){

    println("ENTER YOUR BIRTH YEAR: ")
    val userBirthYear = readLine()?:""
    val currentYear = 2022
    val result = currentYear - userBirthYear.toInt()

    println("Your age is: ${userBirthYear.toInt() - currentYear}")
    println("Your age is: ${currentYear - userBirthYear.toInt()}")

    println("Your age is: $result")

    println("Please enter your bith year")
    val yearInput = readLine()?:""
    val year = yearInput.toInt()
    val age = 2022 - year
    println("Your age is either ${age-1} or $age")
    println("my name is " + "concat")
}