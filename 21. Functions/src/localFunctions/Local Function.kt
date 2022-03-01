/**
 * Create a function that takes a map of users and their bank balance.
 * Inside create a function that takes a number and returns its double.
 * Double each user's bank balance and print out a statement.
 */

fun main() {
    //no se puede poner la variable user
    var user = hashMapOf<String, Double?>(Pair("Alice", 546.0), Pair("Roxana", 50.0), Pair("Elisa", 75.0))
    awesomeBank(user)
    //awesomeBank(hashMapOf(Pair("Alice", 546.0), Pair("Roxana", 50.0), Pair("Elisa", 75.0)))
}   

fun awesomeBank(users: HashMap<String, Double?>){
    fun doubleAmount(amount: Double?) = amount?.times(2)
    for (i in users.keys){
        users[i] = doubleAmount(users[i])
    }
    println(users)
}