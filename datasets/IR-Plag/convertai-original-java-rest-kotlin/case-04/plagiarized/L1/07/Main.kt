package IR

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    
    // Here, we repeat the calculation of distance in miles and kilometers
    var miles = 1
    while (miles <= 10) {
        // Print the result here 10 times
        println("$miles\t\t${miles * 1.609}")
        miles++
    }
}

