fun main() {

    //Capture the subject and use it in the when block
    
    println("Input your name:")
    val input = readLine()?:""
    var name = input
    when(name[0]){
        'A', 'B', 'C' -> println("Hello $name, welcome!")
        in 'D'.. 'F' -> println("Hi $name, how are you?")
        else -> println("Hi!")
    }
}