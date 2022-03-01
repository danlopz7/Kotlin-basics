fun main() {

    var count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"), Pair(4, "Four"))
    //adding a key
    count[5] = "five"
    println(count)

    var countMore = hashMapOf(Pair(20, "twenty"), Pair(30, "thirty"))
    //adding a map
    count.putAll(countMore)
    println(count)

    //remove an element
    count.remove(1)
    println(count)

    //replace
    count.replace(3, "thx")
    println(count)

    //remove all elements
    count.clear()
    println(count)

    val alist = mutableListOf(1, 2, 3, 4)
    println(alist)
}