package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    var jari2: Double = 0.0
    var panjang: Double = 0.0
    println("Enter the radius and length of a cylinder: ")
    jari2 = input.nextDouble()
    panjang = input.nextDouble()
    val luas = jari2 * jari2 * 3.14159
    val total = luas * panjang
    println("The area is $luas , ")
    println("The volume of the cylinder is $total")
}

