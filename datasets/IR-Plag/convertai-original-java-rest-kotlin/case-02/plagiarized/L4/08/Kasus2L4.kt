package IR

import java.util.Scanner

fun main(args: Array<String>) {
    // Enter radius of the cylinder
    println("Enter the radius and length of a cylinder: ")
    val scanner = Scanner(System.`in`)
    val radius = scanner.nextFloat()
    val length = scanner.nextFloat()
    // Hitung Area
    val luas = hitungLuas(radius)
    // Print area cylinder
    println("The area is $luas")
    //Hitung Volume
    val volume = hitungVolume(luas, length)
    // Print volume cylinder
    println("The volume of the cylinder is $volume")
}

private fun hitungLuas(radius: Float): Double {
    return radius * radius * 3.14159
}

private fun hitungVolume(luas: Double, length: Float): Double {
    return luas * length
}

