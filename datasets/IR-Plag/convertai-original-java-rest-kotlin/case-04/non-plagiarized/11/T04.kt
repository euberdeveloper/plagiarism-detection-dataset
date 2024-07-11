package IR

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.text.DecimalFormat

fun main() {
    val d = DecimalFormat("0.000")
    
    println("Miles\tKilometers")
    for (i in 1..10) {
        println("$i\t${d.format(i * 1.609)}")
    }
}

