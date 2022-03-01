fun main() {

    for (i in 10 downTo 0){
        println(i)
        when(i){
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            1 -> println("GO!")
        }
    }

    val message = "We can also go down to zero with a step"
    println(message)
    for (i in 10 downTo 0 step 3){
        println(i)
    }
}