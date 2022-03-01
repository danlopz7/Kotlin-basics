fun main() {

    val colors = hashSetOf<String>()
    val colorsList = listOf("red", "green", "blue")
//    colors.add("red")
//    colors.add("blue")
//    colors.add("green")
    colors.addAll(colorsList)
    println(colors)

    colors.remove("green")
    println(colors)

    val deskObjects = hashSetOf("pencil", "keyboard", "cup", "mouse", "pad")
    val removeObjects = setOf("cup", "pencil", "pad")
    deskObjects.removeAll(removeObjects)
    println(deskObjects)

}