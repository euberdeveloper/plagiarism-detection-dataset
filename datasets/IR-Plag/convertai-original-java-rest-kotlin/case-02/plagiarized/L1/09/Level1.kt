package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val input = Scanner(System.`in`)

    // masukkin radius
    print("Enter the radius and length of a cylinder: ")
    val radius = input.nextDouble()
    val length = input.nextDouble()

    val area = radius * radius * 3.14159
    val volume = area * length
    println("The area is $area")
    println("The volume of the cylinder is $volume")
}

