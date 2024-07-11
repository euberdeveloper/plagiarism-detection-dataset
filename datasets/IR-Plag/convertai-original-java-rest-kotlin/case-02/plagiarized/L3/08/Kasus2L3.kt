package IR

import java.util.Scanner

fun main(args: Array<String>) {
    // Enter radius of the cylinder
    println("Enter the radius and length of a cylinder: ")
    val scanner = Scanner(System.`in`)
    val radius = scanner.nextDouble()
    val length = scanner.nextDouble()
    // Hitung Area
    val luas = radius * radius * 3.14159
    // Print area cylinder
    println("The area is $luas")
    //Hitung Volume
    val volume = luas * length
    // Print volume cylinder
    println("The volume of the cylinder is $volume")
}

