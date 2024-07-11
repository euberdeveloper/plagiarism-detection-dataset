package IR

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var radius: Double
    var length: Double
    var area: Double
    var volume: Double

    print("Enter the radius and length of a cylinder: ")
    radius = sc.nextDouble()
    length = sc.nextDouble()

    area = radius * radius * 3.14159
    volume = area * length

    val a = DecimalFormat("0.0000")
    val v = DecimalFormat("0.0")

    println("The area is ${a.format(area)}")
    println("The volume is ${v.format(volume)}")
}

