package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Enter the radius and length of a cylinder: ")
    val radius = input.nextDouble()
    val length = input.nextDouble()
    val area = radius * radius * 3.14159
    val volume = area * length
    println("The area is $area, ")
    print("The volume of the cylinder is $volume")
}

