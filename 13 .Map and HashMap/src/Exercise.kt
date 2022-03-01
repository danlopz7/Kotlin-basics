fun main() {

    /**
     * You manage an amusement park, and you have a map that stores dates and attendance.
     * var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))
     * Add a value for 26 Sept.
     * How many people attended in total on 25 and 26 Sept?
     * Is data for 22 Sept available?
     */

    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance["26 Sept"] = 5000

    var people1 = attendance["25 Sept"]?:0
    var people2 = attendance["26 Sept"]?:0
    println("People on the 25 and 26 of Sept: ${people1+people2}")

    var people = attendance.getValue("25 Sept") + attendance.getValue("26 Sept")
    println("Total people that attended between Sept 25 and 26: $people ")
    //println("Is data for 22 Sept available? ${attendance.getValue("22 Sept")}")
    println("Is data for 22 Sept available? ${attendance.containsKey("22 Sept")}")
}