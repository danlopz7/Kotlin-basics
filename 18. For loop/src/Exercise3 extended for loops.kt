fun main() {

    println("Input a number:")
    var input = readLine() ?: ""
    var matrixSize = input.toInt()

//    for (i in 1..matrixSize) {
//        for (j in 1..matrixSize) {
//            if (j * i % 3 == 0) {
//                print("\uD83D\uDE00")
//            } else if (j * i % 3 == 1)
//                print("\uD83E\uDD28")
//            else if (j * i % 3 == 2)
//                print("\uD83D\uDE31")
//        }
//        println()
//    }

    for (i in 1..matrixSize) {
        for (j in 1..matrixSize) {
            when (j * i % 3) {
                0 -> print("\uD83D\uDE00")
                1 -> print("\uD83E\uDD28")
                2 -> print("\uD83D\uDE31")
            }
        }
        println()
    }
}