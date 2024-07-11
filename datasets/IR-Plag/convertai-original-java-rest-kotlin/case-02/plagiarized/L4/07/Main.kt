package IR

import java.util.Scanner

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    val input = Scanner(System.`in`)
    // Masukan radius silinder
    print("Enter the radius and length of a cylinder: ")

    val radius = input.nextDouble()
    val length = input.nextDouble()

    // Mencetak luas dan volume
    println("The area is ${calculateArea(radius)}")
    println("The volume of the cylinder is ${calculateVolume(length, radius)}")
}

fun calculateArea(radius: Double): Double {
    return radius * radius * 3.14159
}

fun calculateVolume(length: Double, radius: Double): Double {
    return calculateArea(radius) * length
}

