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
object Kasus2L1 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        // Enter radius of the cylinder
        print("Enter the radius and length of a cylinder: ")

        val radius = input.nextDouble()
        val length = input.nextDouble()
        // Hitung Area
        val area = radius * radius * 3.14159
        //Hitung Volume
        val volume = area * length
        // Print area cylinder
        println("The area is $area")
        // Print volume cylinder
        println("The volume of the cylinder is $volume")
    }
}
