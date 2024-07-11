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
object Kasus6L4 {
    @JvmStatic
    fun main(args: Array<String>) {
        //Delarasi
        val arrNum = IntArray(10)
        val inp = Scanner(System.`in`)
        // for untuk 10 kali input
        for (i in 0..9) {
            // Read a number
            print("Read a number: ")
            arrNum[i] = inp.nextInt()
        }
        // Display the array
        Reverse(arrNum)
    }

    private fun Reverse(arr: IntArray) {
        for (i in 9 downTo 0) {
            //Print angka dalam array
            println(arr[i])
        }
    }
}
