fun main() {

    val numbers = setOf(1, 5, 78, 922, 1024, 500)
    println(numbers.filter { it in 10..99})

    val clients = listOf("Tom", "Laura", "Dennis", "Mark")
    println(clients.sortedBy { it[it.length-1] })

    val ints = listOf(123, 456, 788, 369, 741, 159, 753, 5000)
    println(ints.maxByOrNull { it / 10 % 10 })
    println(ints.maxByOrNull { it % 10 })
    println(ints.maxByOrNull { it })
    println(ints.maxByOrNull { it.toString()[1].toInt() })
}