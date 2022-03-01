fun main() {

    var herName: String = "Lilly"
    val hisName: String? = null
    println(herName)
    println(hisName)

    var catName: String? = "Chonkers"
    catName = null

    var dogName: String = "Fluffy"
//    dogName = null

    val a = 10
    println(a.plus(5))
    println(a+5)

    var b: Int? = 5
    if (b != null) {
        println(b*5)
    }
    println(b?.plus(5))

}