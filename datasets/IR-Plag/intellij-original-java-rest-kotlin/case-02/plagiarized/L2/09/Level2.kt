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
object Level2 {
    //program menghitung luas alas dan volume
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)

        print("Enter the radius and length of a cylinder: ")
        val rad = `in`.nextDouble()
        val panjang = `in`.nextDouble()

        val luas = rad * rad * 3.14159
        val vol = luas * panjang
        println("The area is $luas")
        println("The volume of the cylinder is $vol")
    }
}
