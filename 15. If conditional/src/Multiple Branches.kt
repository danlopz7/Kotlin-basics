fun main() {

    println("Input an animal: ")
    var animal = readLine()?:"Cat"

    val action = if(animal == "dog"){
        "petted"
    } else if (animal == "cat"){
        "feed it"
    } else if(animal == "crocodile"){
        "run away"
    } else {
        "google it"
    }
    println(action)
}