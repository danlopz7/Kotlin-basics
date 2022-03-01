fun main() {

    println("Do you have the keys? Enter \"Yes\" or \"No\":")
    var input = readLine()?:""
    var userHasKeys = false

    if(input == "yes"){
        userHasKeys = true
    }

    if(userHasKeys){
        println("Car is starting")
    }else{
        println("CAR CANNOT START")
    }
}