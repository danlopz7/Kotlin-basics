import java.lang.Exception

fun main() {

    println("Enter a number: ")
    val input = readLine()
    try {
        var number = input?.toInt()
        var result = number?.times(5)
        println(result)

    } catch (e: Exception){
        println("Te value '$input' is not a number")
        println("An exception happened ${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Code executed")
    }


}