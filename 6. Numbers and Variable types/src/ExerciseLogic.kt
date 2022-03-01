fun main() {

    /**
     * A farmer has 3 cows, of which only one produces milk
     * He has two children
     * He is trying to apply for funding. The requirements are:
     * You must have no more than 5 animals
     * Animals must produce something can be sold
     * Regardless of the other conditions, funding will be approved if the family has 3 or more members
     */

    var totalAnimals = 3
    var canAnimalsProduce = true
    var familyMembers = 2

    var canApplyforFunding = (((totalAnimals <= 5 ) && (canAnimalsProduce == true)) || familyMembers + 1 >= 3)

    println("Can the farmer apply for funding? $canApplyforFunding")
}