package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var radius: Double
        var height: Double

        // masukkan nilai
        print("Enter the radius and length of a cylinder: ")
        radius = `in`.nextDouble()
        height = `in`.nextDouble()

        count(radius, height)
    }

    private fun count(rad: Double, height: Double) {
        println("The area is ${Math.pow(rad, 2.0) * Math.PI}")
        println("The volume of the cylinder is ${Math.pow(rad, 2.0) * Math.PI * height}")
    }
}

