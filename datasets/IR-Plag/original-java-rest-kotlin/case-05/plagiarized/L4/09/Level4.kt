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
object Level4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val masukkan = Scanner(System.`in`)
        var number: Int
        var sisaBagi: Int

        print("Enter an integer: ")
        number = masukkan.nextInt()

        while (number != 0) {
            sisaBagi = number % 10
            print(sisaBagi)
            number = number / 10
        }
        println()
    }
}
