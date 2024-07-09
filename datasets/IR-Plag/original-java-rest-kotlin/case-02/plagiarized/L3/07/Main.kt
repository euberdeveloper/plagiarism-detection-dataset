package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        // Masukan radius silinder
        print("Enter the radius and length of a cylinder: ")

        val jejari = input.nextDouble()
        val panjang = input.nextDouble()

        val area = jejari * jejari * 3.14159
        val volume = area * panjang
        // Mencetak luas dan volume
        println("The area is $area")
        println("The volume of the cylinder is $volume")
    }
}
