package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus5L6 {
    @JvmStatic
    fun main(args: Array<String>) {
        //input data
        val inp = Scanner(System.`in`)
        print("Enter an integer: ")
        val angka = inp.next()
        for (i in angka.length - 1 downTo 0) {
            print(angka[i])
        }
        println()
    }
}
