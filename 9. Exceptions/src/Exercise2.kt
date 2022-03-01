import java.lang.Exception

fun main() {

//    println("enter total km you ran today: ")
//    var input = readLine()
//    try {
//        var totalKm = input?.toDouble()?:0.0
//        var totalMi = totalKm*0.62
//        println("You ran $totalMi Miles")
//        println("variable totalKm is a dataType " + totalKm::class.java)
//        println("variable totalMi is a dataType " + totalMi::class.java)
//    } catch (e: Exception){
//        println("The value '$input' is not a number")
//        println("An error ocurred ${e.localizedMessage}")
//        e.printStackTrace()
//    } finally {
//        println("Code executed")
//    }
//-----------------------------------------------------------------------------------
    println("enter total km you ran today: ")
    var input = readLine()
    try {
        var totalKm = input?.toDouble()
        println("Distance $totalKm Km is ${totalKm?.times(0.62)} Miles")
    } catch (e: Exception){
        println("The value '$input' is not a number")
        println("An error ocurred ${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Code executed")
    }
}