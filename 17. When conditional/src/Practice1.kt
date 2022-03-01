fun main() {

    println("How many meals do you have every day?")
    var input = readLine()?:""
    var meals = input.toInt()
    when(meals){
        in 0.. 2 -> println("You should increase the numbers of meals every day")
        3 -> println("Perfect! Having 3 meals per day is the recommended to live a healthy life.")
        else -> println("You can't have more than 3 meals per day.")
    }
}