package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val x = Scanner(System.`in`)
    var vol: Double = 0.0
    var luasAlas: Double = 0.0

    print("Enter the radius and length of a cylinder: ")
    val radius = x.nextDouble()
    val length = x.nextDouble()

    luasAlas = radius * radius * 3.14159
    vol = luasAlas * length

    println("The area is $luasAlas")
    println("The volume of the cylinder is $vol")
}

