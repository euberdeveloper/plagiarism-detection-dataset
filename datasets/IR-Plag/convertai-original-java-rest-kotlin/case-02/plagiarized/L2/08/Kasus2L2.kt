package IR

import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    // Enter radius of the cylinder
    print("Enter the radius and length of a cylinder: ")

    val radius = `in`.nextFloat()
    val length = `in`.nextFloat()
    // Hitung Area
    val luas = radius * radius * 3.14159
    //Hitung Volume
    val volume = luas * length
    // Print area cylinder
    println("The area is $luas")
    // Print volume cylinder
    println("The volume of the cylinder is $volume")
}

