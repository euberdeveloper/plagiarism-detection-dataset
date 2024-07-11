package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus2 {
    fun hitungArea(r: Double): Double {
        return r * r * Math.PI
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        // Enter radius of the cylinder
        print("Enter the radius and length of a cylinder: ")
        val r = input.nextDouble()
        val l = input.nextDouble()

        println("The area is " + hitungArea(r))
        println("The volume of the cylinder is " + hitungArea(r) * l)
    }
}
