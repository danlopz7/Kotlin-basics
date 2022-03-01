fun main() {

    // Print out a greeting message 10 times
    var i = 0
    while(i < 10){
        i++
        println("#$i greeting")
    }

    // Desing a program that prints out a hello message for each cat, using a while loop
    var cats = listOf("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
    var j = 0
    while (j < cats.size){
        println("Hello ${cats[j]}")
        j++
    }
}