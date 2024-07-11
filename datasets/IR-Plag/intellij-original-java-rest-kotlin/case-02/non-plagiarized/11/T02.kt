package IR

import java.text.DecimalFormat
import java.util.*

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

object T02 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val area: Double
        val volume: Double

        print("Enter the radius and length of a cylinder: ")
        val radius = sc.nextDouble()
        val length = sc.nextDouble()

        area = radius * radius * 3.14159
        volume = area * length

        val a = DecimalFormat("0.0000")
        val v = DecimalFormat("0.0")

        println("The area is " + a.format(area))
        println("The volume is " + v.format(volume))
    }
}
