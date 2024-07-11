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


        // Mencetak luas dan volume
        println("The area is " + hitungArea(jejari))
        println("The volume of the cylinder is " + hitungVolume(panjang, jejari))
    }

    fun hitungArea(jejari: Double): Double {
        var area: Double
        return (jejari * jejari * 3.14159).also { area = it }
    }

    fun hitungVolume(panjang: Double, jejari: Double): Double {
        var volume: Double
        return (hitungArea(jejari) * panjang).also { volume = it }
    }
}
