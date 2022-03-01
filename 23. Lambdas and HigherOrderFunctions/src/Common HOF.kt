fun main() {
    val clients = listOf("Alice", "Carol", "Dan", "Bob")
    clients.forEach { println("hi $it") }

    clients.filter { it.length < 5 }
        .forEach {
            println("hello $it")
        }

    val sizes = clients.map { it.length }
    println(sizes)

    val sorted1 = clients.sortedBy { it.length }
    println(sorted1)

    //Display the list of clients sorted by the first letter of their name.
    val sorted = clients.sortedBy { it.first() }
    println(sorted)

    //Display the list of clients sorted by the last letter of their name.
    println(clients.sortedBy { it.last() })

    //MaxBy allows us to get the maximum value of an element
    val max = clients.maxByOrNull { it.length }
    println(max)

    val min = clients.minByOrNull { it.length }
    println(min)

    
}