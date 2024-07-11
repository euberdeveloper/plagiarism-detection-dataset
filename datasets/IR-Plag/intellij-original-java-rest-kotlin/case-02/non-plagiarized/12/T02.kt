package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
object T02 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        print("Enter the radius and length of a cylinder : ")
        val radius = sc.nextDouble()
        val length = sc.nextDouble()

        val area = radius * radius * 3.14159
        val volume = area * length

        println("The area is $area")
        println("The volume $volume")
    }
}
