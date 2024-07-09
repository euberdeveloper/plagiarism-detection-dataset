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
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)

        // Enter radius of the cylinder dddd
        print("Enter the radius and length of a cylinder: ")
        val radius = input.nextDouble()
        val length = input.nextDouble()

        val area = radius * radius * 3.14159
        val volume = area * length

        println("The area is $area")
        println("The volume of the cylinder is $volume")
    }
}
