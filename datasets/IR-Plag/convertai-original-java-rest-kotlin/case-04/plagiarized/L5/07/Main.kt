package IR

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    var jarak: Int
    println("Miles\t\tKilometers")
    println("-------------------------------")
    // Here, we repeat the calculation of distance in miles and kilometers
    jarak = 1
    printJarakDalamMilDanKilo(jarak)
}

fun printJarakDalamMilDanKilo(jarak: Int) {
    for (i in jarak..10) {
        // Print the results here 10 times
        println("$i\t\t${i * 1.609}")
    }
}

