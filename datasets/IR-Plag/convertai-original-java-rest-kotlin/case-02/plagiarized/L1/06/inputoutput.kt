package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    // Enter radius of the cylinder
    print("Enter the radius and length of a cylinder : ") // untuk print
    val radius = input.nextDouble() // menginput radius
    val length = input.nextDouble() // menginput length
    val area = radius * radius * 3.14159 // mencari area
    val volume = area * length // mencari voulume
    println("The area is $area") // mengeluarkan hasil
    println("The volume of the cylinder is $volume") // mengeluarkan hasil
}

