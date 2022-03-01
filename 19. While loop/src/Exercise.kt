/**
 * You have a set of userNames. Ask the user to choose their username. If their username is taken, print out
 * a message and ask again. Add the username to the set.
 */

fun main() {
    var flag = false
    val userNames = hashSetOf("john", "bob", "alice")

    do{
        println("Choose your username:")
        var input = readLine()?:""

        //if(input in userNames)
        if(userNames.contains(input)){
            println("$input is already taken. Select another username:")
        } else{
            userNames.add(input)
            println("Your username is $input. Welcome!")
            flag = true
        }
    }while (!flag)
//    for (users in userNames){
//        print("$users, ")
//    }
    println(userNames)
}