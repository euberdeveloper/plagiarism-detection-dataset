package IR

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    // Here, we repeat the calculation of distance in miles and kilometers
    var jarak = 1
    while (jarak <= 10) {
        // Print the results here 10 times
        println("$jarak\t\t${jarak * 1.609}")
        jarak++
    }
}

