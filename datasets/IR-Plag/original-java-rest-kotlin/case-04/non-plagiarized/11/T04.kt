package IR

import java.text.DecimalFormat

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

object T04 {
    @JvmStatic
    fun main(args: Array<String>) {
        val d = DecimalFormat("0.000")

        println("Miles\tKilometers")
        for (i in 1..10) {
            println(i.toString() + "\t" + d.format(i * 1.609))
        }
    }
}
