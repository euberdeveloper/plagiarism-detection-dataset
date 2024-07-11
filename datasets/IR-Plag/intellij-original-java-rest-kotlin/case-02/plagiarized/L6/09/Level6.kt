package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)

        //masukkan nilai
        print("Enter the radius and length of a cylinder: ")
        val radius = `in`.nextDouble()
        val tinggi = `in`.nextDouble()

        count(radius, tinggi)
    }

    private fun count(rad: Double, height: Double) {
        println("The area is " + rad.pow(2.0) * Math.PI)
        println("The volume of the cylinder is " + rad.pow(2.0) * Math.PI * height)
    }
}
