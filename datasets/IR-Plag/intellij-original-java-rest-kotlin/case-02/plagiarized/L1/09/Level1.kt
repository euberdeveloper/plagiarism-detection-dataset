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
object Level1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)


        //masukkin radius
        print("Enter the radius and length of a cylinder: ")
        val radius = input.nextDouble()
        val length = input.nextDouble()

        val area = radius * radius * 3.14159
        val volume = area * length
        println("The area is $area")
        println("The volume of the cylinder is $volume")
    }
}
