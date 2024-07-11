package IR

import java.util.Scanner

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
fun main() {
    val milToKilo = 1.609
    println("Miles\tKilometers")
    for (i in 1..10) {
        val kilo = i * milToKilo
        println("$i\t$kilo")
    }
}

