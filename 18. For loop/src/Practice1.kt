fun main() {

    //printing greetins 10 times
    for (i in 1.. 10){
        println("$i Greetings")
    }

    for (i in 1.. 100){
        if(i < 100)
            print("$i, ")
        else
            print(i)
    }
    println()

    var total = 0
    for (i in 1.. 100){
        total += i
    }
    println("total is $total")

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
    for (purchases in customers){
        println("Client ${purchases.key} purchased ${purchases.value}")
    }

    for (customerName in customers.keys){
        val purchases = customers[customerName]   //getValue(customerName)
        println("$customerName you purchased $purchases items")
    }
}