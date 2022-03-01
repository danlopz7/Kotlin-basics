fun main() {

    var animals = listOf("dog", "parrots", "dolphins", "turtles")
    println(animals.size)
    println(animals[1])

    var customers = arrayListOf("John", "Fox Mcclaud", "Falco Lombardi", "pikachu")
    customers.add("pichu")
    customers.remove("John")
    println(customers)

    var items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")

    items.removeAll(removedItems)
    println(items)

//    items.addAll(removedItems)
//    println(items)
//    items.removeAt(3)
//    items.removeAt(4)
//    items.removeAt(5)
//    items.removeAt(6)
//    println(items)
}