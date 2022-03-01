/**
 * An animal shelter has a list of animals that it tries to get adopted.
 * They are trying to print a message, to either advertise available animals
 * if there are any animals in the shelter, or thank the community if all animals have
 * been adopted. Design a program to print out that message.
 */

fun main() {

    var animals = arrayListOf<String>("cat", "dog")
    if(animals.isEmpty())
        println("Thank you")
    else
        println("Adopt, we have $animals")
}