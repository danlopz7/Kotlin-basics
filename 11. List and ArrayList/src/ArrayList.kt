fun main() {

    // Arraylist are a mutable list type
    val test: ArrayList<String> = arrayListOf()
    var noColors = arrayListOf<String>()
    var colors = arrayListOf("blue", "red")
    println(colors)

    // Adding an element
    colors.add("Yellow")
    println(colors)

    //adding another collection
    var moreColors = arrayListOf("pink", "teal")
    colors.addAll(moreColors)
    println(colors)

    //remove an element
    colors.remove("red")
    println(colors)

    //remove elements of a collection
    colors.removeAll(moreColors)
    println(colors)

    //remove element by position
    colors.removeAt(1)
    println(colors)
}