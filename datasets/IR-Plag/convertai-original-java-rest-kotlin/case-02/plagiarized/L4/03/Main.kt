package IR

import java.util.Scanner

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
fun main() {
    //Enter radius of the cylinder
    println("Enter the radius and length of a cylinder: ")
    val input = Scanner(System.`in`)
    val radius = input.nextDouble()
    val length = input.nextDouble()
    val areas = radius * radius * 3.14159
    val volumes = areas * length
    cetak(areas, volumes)
}

fun cetak(areas: Double, volumes: Double) {
    println("The area is $areas")
    println("The volume of the cylinder is $volumes")
}
