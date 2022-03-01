/**
 * You have a list of customers for your online store.

A new customer has joined.

Print the list of customers.

A customer has chosen to leave.

Print the list of customers.
 */

fun main() {

    val customers = hashSetOf("John", "Dan", "Joe", "Manny")
    println(customers)

    println("Input name of joining customer: ")
    val newCustomer = readLine()?:""
    customers.add(newCustomer)
    println(customers)

    println("Input name of leaving customer: ")
    val leavingCustomer = readLine()?:""
    customers.remove(leavingCustomer)
    println(customers)
}