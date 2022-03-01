/**
 * Ask the user to input the current time, only the hour
 * If it's before twelve, print 'hour' am
 * If it's after, print ('hour'-12) pm
 */

fun main() {

    println("Input the current hour(0-23): ")
    val input = readLine()?:"0"
    var time = input.toInt()

    if(time < 12){
        println("it's $time am")
    }else{
        if(time == 12){
            println("it's $time pm")
        } else{
            println("it's ${time-12} pm")
        }
    }
}