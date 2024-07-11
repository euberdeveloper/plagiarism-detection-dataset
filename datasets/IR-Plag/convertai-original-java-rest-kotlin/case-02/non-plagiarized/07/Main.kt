package IR

import java.util.Scanner

fun main(args: Array<String>) {
    println("Enter the radius and length of a cylinder:")
    val sc = Scanner(System.`in`)
    val radius = sc.nextDouble()
    val length = sc.nextInt()
    val area = radius * radius * 3.14159
    val volume = length * radius
    println("The area is $area")
    println("The volume is $volume")
}

