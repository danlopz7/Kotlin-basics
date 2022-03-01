fun main() {

    val favouritePet = "Dog"
    val availablePets = listOf("Cat", "Dog", "Bird")
    if(favouritePet in availablePets) println("We have your next bestfriend") else println("Sorry we dont have $favouritePet here")

}