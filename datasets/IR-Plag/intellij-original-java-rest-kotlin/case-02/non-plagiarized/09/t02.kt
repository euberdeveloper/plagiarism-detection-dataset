package IR

import java.text.DecimalFormat
import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 51BE04B11C5F2F5AD96A396632DC3F76
 */

object t02 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter the radius and length of a cylinder : ")
        val radius = sc.nextDouble()
        val length = sc.nextDouble()
        val area = radius * radius * 3.14159
        val volume = (radius * radius * 3.14159) * length
        val areaFormat = DecimalFormat("#.#####")
        val volumeFormat = DecimalFormat("#.#")

        println("The area is " + areaFormat.format(area))
        println("The volume is " + volumeFormat.format(volume))
    }
}
