package IR

import java.util.Scanner

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
fun main() {
    val input = Scanner(System.`in`)
    // Enter radius of the cylinder
    print("Enter the radius and length of a cylinder: ")
    val r = input.nextDouble()
    val l = input.nextDouble()
    println("The area is ${r * r * Math.PI}")
    println("The volume of the cylinder is ${r * r * Math.PI * l}")
}

