package IR

import java.util.Scanner

fun main(args: Array<String>) {
    // Enter radius of the cylinder
    println("Enter the radius and length of a cylinder: ")
    val scanner = Scanner(System.`in`)
    // Input radius
    val radius = scanner.nextFloat()
    // Calculate area
    val area = calculateArea(radius)
    // Input length
    val length = scanner.nextFloat()
    // Print area of cylinder
    println("The area is $area")
    // Print volume of cylinder
    println("The volume of the cylinder is ${calculateVolume(area, length)}")
}

private fun calculateArea(radius: Float): Double {
    return radius * radius * 3.14159
}

private fun calculateVolume(area: Double, length: Float): Double {
    return area * length
}

