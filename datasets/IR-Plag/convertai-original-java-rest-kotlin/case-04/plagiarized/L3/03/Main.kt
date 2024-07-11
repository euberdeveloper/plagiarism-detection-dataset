package IR

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
fun main() {
    var mile = 1
    println("Miles\t\tKilometers")
    println("-------------------------------")
    
    // Use while loop
    while (mile <= 10) {
        println("$mile\t\t${mile * 1.609}")
        mile++
    }
}

