package IR

fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    
    // Use while loop
    var miles = 1
    while (miles <= 10) {
        // Display the result
        println("$miles\t\t${miles * 1.609}")
        miles++
    }
}
