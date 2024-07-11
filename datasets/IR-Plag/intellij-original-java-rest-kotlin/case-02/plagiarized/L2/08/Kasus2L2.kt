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
object Kasus2L2 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        // Enter radius of the cylinder
        print("Enter the radius and length of a cylinder: ")

        val radius = `in`.nextFloat()
        val length = `in`.nextFloat()
        // Hitung Area
        val luas = radius * radius * 3.14159
        //Hitung Volume
        val volume = luas * length
        // Print area cylinder
        println("The area is $luas")
        // Print volume cylinder
        println("The volume of the cylinder is $volume")
    }
}
