fun main() {

    val animal = "cat"
    var action = when (animal) {
        "dog" -> "pet it"
        "cat" -> {
            println("I met a kitty")
            "feed it"
        }
        else -> "google it"
    }
    println("When you meet a $animal you should $action")

    val month = "June"
    var days = when(month){
        "January", "March", "May", "July", "August", "October", "December" -> 31
        "february" -> 28
        else -> 30
    }
    println("$month has $days days")
}