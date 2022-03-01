fun main() {

    var count =  mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"), Pair(4, "Four"))
    println(count)

    val count2 = mapOf<Int, String>()
    println(count2)

    //the key value, not index nor the second element.
    println(count[2])

    println(count.keys)
    println(count.values)       

    println("this map has a size of ${count.size}")
    println("Does the map have the key 2? : ${count.containsKey(2)}")
    println("Does the map have the key 5? : ${count.containsKey(5)}")
    println("Does the map have the value \"one\"? ${count.containsValue("one")}")
}