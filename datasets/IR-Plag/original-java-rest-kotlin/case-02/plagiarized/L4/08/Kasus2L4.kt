package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus2L4 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        // Enter radius of the cylinder
        print("Enter the radius and length of a cylinder: ")
        val `in` = Scanner(System.`in`)
        val radius = `in`.nextFloat()
        val length = `in`.nextFloat()
        // Hitung Area
        val luas = hitungLuas(radius)
        // Print area cylinder
        println("The area is $luas")
        //Hitung Volume
        val volume = hitungVolume(luas, length)
        // Print volume cylinder
        println("The volume of the cylinder is $volume")
    }

    private fun hitungLuas(radius: Float): Double {
        return radius * radius * 3.14159
    }

    private fun hitungVolume(luas: Double, length: Float): Double {
        return luas * length
    }
}
