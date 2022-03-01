/**
 * Create a higher order function that takes a list of client names and a lambda expression that returns a string.
 * It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.
 * Create a lambda expression that takes a client name String and returns a personalised message.
 * Call the HOF and print out the result.
 */

fun main() {
    var myLambda = { client: String -> "Hello $client, how are you?" }
    var clients = arrayListOf("Alexis", "Joe", "Beth", "Liss")

    println(clients)
    getMessages2(clients, myLambda)
    println(clients)
    println()

    clients = arrayListOf("Alexis", "Joe", "Beth", "Liss")
    println(getMessages(clients, myLambda))
    println()

    clients = arrayListOf("Alexis", "Joe", "Beth", "Liss")
    println(getMessages(clients){name -> "hi $name, how are you?"})
    println()
    val messages = getMessages(clients){name -> "hi $name, how are you?"}
    println(messages)

    for(i in 0 until clients.size){
        println("Message for ${clients[i]}")
        println(messages[i])
        println()
    }
}

fun getMessages(clients: ArrayList<String>, lambda: (String) -> String): ArrayList<String> {
    var messages = arrayListOf<String>()
    for (i in clients)
        messages.add(lambda(i))
    return messages
}

fun getMessages2(clients: ArrayList<String>, lambda: (String) -> String): ArrayList<String> {
    var i = 0
    while (i < clients.size) {
        clients[i] = lambda(clients[i])
        i++
    }
    return clients
}