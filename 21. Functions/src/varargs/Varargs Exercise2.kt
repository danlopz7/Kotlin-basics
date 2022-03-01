/**
 * Create a function that takes an integer variable "count" and a variable
 * number of clients names. Print out "count" hello messages for each client.
 * i.e. if count = 3, print out 3 hello messages for each client.
 */
fun main() {
    printHello(2, "joe", "set", "elijah")
}

fun printHello(count: Int, vararg names: String){
    for(name in names){
        for (i in 1.. count){
            print("Hello $name -- ")
        }
        println()
    }
}