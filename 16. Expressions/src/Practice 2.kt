/**
 * A lady has cats
 * 1 to 3 -> few cats
 * 4 to 6 -> several cats
 * 7 or more -> many cats
 */

fun main() {

    println("Input the amount of cats the lady has:")
    val input = readLine()?:""
    var cats = input.toInt()
    val howMany = if(cats == 0)
        "no cats"
    else if(cats in 1.. 3)
        "few cats"
    else if(cats in 4.. 6)
        "several cats"
    else
        "many cats"
    println("This lady has $howMany")

//    if(cats == 0)
//        println("no cats")
//    else if(cats in 1.. 3)
//        println("few cats")
//    else if(cats in 4.. 6)
//        println("several cats")
//    else
//        println("many cats")
//    //println("This lady has $howMany")
}