fun main() {

    for(i in 1..5){
        for (j in 1..5){
            print("$i,$j \t")
        }
        println()
    }

    println()

    for (i in 1..5){
        for (j in 1..5){
            if (i == j){
                print("diagonal \t")
            }else
                print("$i,$j  \t\t")
        }
        println()
    }

    println()

    val matrixSize = 4
    for (i in 0..matrixSize){
        for (j in 0..matrixSize){
            if (i == j){
                print("diagonal \t")
            }else
                print("$i,$j  \t\t")
        }
        println()
    }
}