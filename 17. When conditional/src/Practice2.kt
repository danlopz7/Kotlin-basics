fun main() {

    println("Input the current hour(0-23):")
    var input = readLine()?:""
    var hour = input.toInt()
    if(hour > 23) hour = 23
    var timeDay = when (hour){
        in 6.. 11 -> "morning"
        in 12.. 14 -> "noon"
        in 15.. 17 -> "afternoon"
        in 18.. 21 -> "evening"
        else -> "night"
    }
    println("At $hour:00 it's $timeDay")
}