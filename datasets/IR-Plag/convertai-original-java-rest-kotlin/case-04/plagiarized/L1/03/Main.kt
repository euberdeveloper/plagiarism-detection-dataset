package IR

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
fun main() {
    println("Miles\t\tKilometers")
    println("-------------------------------")
    
    // Use while loop
    var miles = 1
    while (miles <= 10) {
        println("$miles\t\t${miles * 1.609}")
        miles++
    }
}

