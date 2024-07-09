package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
object T02 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter the radius and length of a cylinder:")
        val radius = sc.nextDouble()
        val length = sc.nextDouble()
        val area: Double = radius.pow(2.0) * Math.PI
        val volume = area * length
        println("The area is $area")
        println("The volume is $volume")
    }
}
