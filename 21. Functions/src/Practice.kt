/**
 * Create a function that receives the price of a product, adds 20% tax and returns the result.
 * These are the products in your online store:
 * val products = hashMapOf(Pair("shoes", 29.99), Pair("Socks", 5.99), Pair("jeans", 39.99))
 * Print out the final price for each product.
 */

fun main() {

    val products = hashMapOf(Pair("shoes", 29.99), Pair("Socks", 5.99), Pair("jeans", 39.99))
    for (item in products){
        val price = priceWithTaxes2(item.value)
        println("${item.key} costs $price")
        //println("for product ${item.key} final price is: ${priceWithTaxes(item.value)}")
    }
}

fun priceWithTaxes(product: Double) = product*1.20
fun priceWithTaxes2(product: Double?) = product?.times(1.20)