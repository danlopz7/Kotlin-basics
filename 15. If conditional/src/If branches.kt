fun main() {

    val response = 404
    val message = if(response / 100 == 1){
        "Information response"
    } else if (response / 100 == 2){
        "Success"
    } else if (response / 100 == 3){
        "Redirect"
    } else if(response / 100 == 4){
        "Client error"
    } else{
        "Server error"
    }
    println(message)
}