fun main() {

    /**
     *  Ask the user to input a year. For each month of that year, print out how many days there are.
     *  Make sure you count leap years.
     *  Assume a leap year is a year that is divisible by 4.
     */

    println("Input a year: ")
    var input = readLine() ?: ""
    var year = input.toInt()

    for (i in 1..12) {
        var message = when(i){
            1 -> "January has 31 days"
            2 -> if(year % 4 == 0) "February has 28 days" else "February has 29 days"
            3 -> "March has 31 days"
            4 -> "April has 30 days"
            5 -> "May has 31 days"
            6 -> "June has 30 days"
            7 -> "July has 31 days"
            8 -> "August has 31 days"
            9 -> "September has 30 days"
            10 -> "October has 31 days"
            11 -> "November has 30 days"
            12 -> "December has 31 days"
            else -> ""
        }
        println(message)
    }
}
