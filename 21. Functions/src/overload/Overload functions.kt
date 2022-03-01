/**
 * Create a function that takes a product name and price. It adds 20% tax to that product and displays a message
 * saying how much the product costs.
 * Overload the function so that it takes a map of products and prices, and does the same thing.
 * Call both functions in your program.
 */
fun main() {
    var articles = mapOf(Pair("socks", 5.99), Pair("shoes", 14.99), Pair("jacket", 25.99))
    finalPrice(articles)
}

// when we extract data from our map, we will retrieve nullable double
fun finalPrice(product: String, price: Double?){
    var priceWithTaxes = price?.times(1.20)
    println("A $product costs $priceWithTaxes")
}

fun finalPrice(articles: Map<String, Double>){
    for (product in articles){
       // finalPrice(product, articles[product])
        finalPrice(product.key, product.value)
    }
}