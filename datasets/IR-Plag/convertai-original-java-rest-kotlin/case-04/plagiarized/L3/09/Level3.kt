package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    // Initialization
    var mile = 1

    println("Miles\t\tKilometers")
    println("-------------------------------")

    while (mile <= 10) {
        println("$mile\t\t${mile * 1.609}")
        mile++
    }
}

