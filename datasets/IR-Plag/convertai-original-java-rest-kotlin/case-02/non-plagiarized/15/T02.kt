package IR

import java.util.Scanner

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var radius: Double
    var length: Double
    var area: Double
    var volume: Double
    println("Enter the radius and length of a cylinder: ")
    radius = sc.nextDouble()
    length = sc.nextDouble()
    area = radius * radius * 3.14159
    volume = area * length
    println("The area is $area")
    println("The volume is $volume")
}

