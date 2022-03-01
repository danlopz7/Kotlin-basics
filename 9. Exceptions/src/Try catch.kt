import java.lang.Exception

fun main() {

    println("Enter a number: ")
    val test = readLine()
    try{
        println(test?.toInt())
    } catch (e: Exception){
        //imprime logs de fallo
        println("An exception happened \n${e.localizedMessage}")
        e.printStackTrace()
    }
}