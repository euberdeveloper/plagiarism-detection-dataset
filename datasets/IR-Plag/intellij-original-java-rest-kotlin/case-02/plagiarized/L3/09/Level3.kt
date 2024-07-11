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
object Level3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val x = Scanner(System.`in`)
        var vol = 0.0
        var luasAlas = 0.0

        print("Enter the radius and length of a cylinder: ")
        val radius = x.nextDouble()
        val length = x.nextDouble()

        luasAlas = radius * radius * 3.14159
        vol = luasAlas * length

        println("The area is $luasAlas")
        println("The volume of the cylinder is $vol")
    }
}
