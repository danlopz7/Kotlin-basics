/**
 * Define two variables

val hasEggs = true
val hasBacon = false
A man goes to the market. His instructions are:

If you find eggs, buy 12

If you buy eggs, and you also find bacon, buy two packs

Eggs cost 5 each.
A pack of bacon costs 20.
How much does the man spend at the market?
 */
fun main() {

    val hasEggs = false
    val hasBacon = true
    val eggs = 5
    val baconPack = 20
    var total = 0

    if(hasEggs){
        total += eggs * 12
        if(hasBacon){
            total += baconPack*20
        }
    } else{
        println("No eggs available")
    }
   /*if(hasEggs && hasBacon){
        total += baconPack*20
    }*/
    println("Total is $total")
}