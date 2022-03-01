fun main() {

    val numbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    println("Is the number 21 a primer number? : ${numbers.contains(21)}")
    println("Is the number 13 a primer number? : ${numbers.contains(13)}")

    /**
     * If you want to buy a drink that you both can enjoy, what are the options you have? Print out the result
     */
    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")
    val theirDrinks = hashSetOf("water", "orange juice", "pineapple juice", "milk")

    myDrinks.retainAll(theirDrinks)
    println(myDrinks)

    /**
     * Your company has very strict dress code. Only certain color clothes can be worn in the office.
     * You have certain colors in your wardrobe.
     * What color clothes can you wear.
     * Your company has added another color, “red” to their list. What options do you have now?
     */

    var acceptedColors = hashSetOf("white", "black", "gray")
    val myColors = hashSetOf("blue", "red", "black", "green")

    acceptedColors.retainAll(myColors)
    println("I can only wear $acceptedColors")

    acceptedColors = hashSetOf("white", "black", "gray")
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println("these are the colors available for me: $acceptedColors")
}