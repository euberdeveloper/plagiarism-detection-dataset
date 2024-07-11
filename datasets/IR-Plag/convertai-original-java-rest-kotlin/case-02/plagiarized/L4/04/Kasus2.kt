package IR

import java.util.Scanner

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
fun hitungArea(r: Double): Double {
    return r * r * Math.PI
}

fun hitungVolume(r: Double, l: Double): Double {
    return hitungArea(r) * l
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // Enter radius of the cylinder
    print("Enter the radius and length of a cylinder: ")
    val r = input.nextDouble()
    val l = input.nextDouble()

    println("The area is ${ hitungArea(r) }")
    println("The volume of the cylinder is ${ hitungVolume(r, l) }")
}

