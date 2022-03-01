fun main() {

    var animal = "cat"
    var action: String?
    when (animal) {
        "cat" -> {
            action = "feed it"
        }
        "dog" -> {
            action = "pet it"
        }
        else -> {
            action = "google it"
        }
    }
    println("When you meet a $animal you should $action")

    var result = ""
    var number = 1234
    when (number % 2) {
        1 -> result = "Number is odd"

        0 -> result = "Number is even"
    }
    println(result)
}