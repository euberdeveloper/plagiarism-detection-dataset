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
object Kasus6L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        //Delarasi
        val input = Scanner(System.`in`)
        val num = IntArray(10)
        // for untuk 10 kali input
        for (i in 0..9) {
            // Read a number
            print("Read a number: ")
            num[i] = input.nextInt()
        }
        // Display the array
        for (i in 9 downTo 0) {
            //Print angka dalam array
            println(num[i])
        }
    }
}
