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
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
object T02 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        print("Enter the radius and length of a cylinder :")
        val radius = s.nextDouble()
        val length = s.nextDouble()
        val area = radius * radius * 3.14159

        val df = DecimalFormat(".####")
        val df2 = DecimalFormat(".#")
        val volume = area * length
        println("The area is " + df.format(area))
        println("The volume is " + df2.format(volume))
    }
}
