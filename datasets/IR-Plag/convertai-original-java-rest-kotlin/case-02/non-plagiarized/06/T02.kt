package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the radius and the length of the cilinder : ")
    val rad = sc.nextDouble()
    val length = sc.nextDouble()
    val area = Math.PI * rad * rad
    val volume = Math.PI * rad * rad * length
    println("The area is $area")
    println("The volume is $volume")
}

