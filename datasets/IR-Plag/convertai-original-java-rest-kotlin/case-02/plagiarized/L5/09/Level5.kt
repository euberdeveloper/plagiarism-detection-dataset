package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        var radius: Double
        var height: Double

        // Get input
        print("Enter the radius and length of a cylinder: ")
        radius = input.nextDouble()
        height = input.nextDouble()

        calculate(radius, height)
    }

    private fun calculate(radius: Double, height: Double) {
        val area = radius * radius * 3.14159
        val volume = radius * radius * 3.14159 * height
        println("The area is $area")
        println("The volume of the cylinder is $volume")
    }
}

