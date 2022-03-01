fun main() {

    println("Enter the amount in your bank account: ")
    val amountInput = readLine()?:""
    val amount1 = amountInput.toDouble()
    var amountAfter5Years = amount1 * 1.055 * 1.055 * 1.055 * 1.055 * 1.055
    println("After 5 years, with an interest of 5.5% per year, you will have $amountAfter5Years")

    var cantidad = 0.0

    var i = 1
    while (i <= 5){
        if(i == 1){
            cantidad = amount1*1.055
        }else{
            cantidad *= 1.055
        }
        i++
    }
    println("testing $cantidad")
}