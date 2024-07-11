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
object Kasus6L6 {
    @JvmStatic
    fun main(args: Array<String>) {
        //Delarasi
        val arrNum = IntArray(10)
        val inp = Scanner(System.`in`)
        // for untuk 10 kali input
        var i = 9
        while (i >= 0) {
            // Read a number
            print("Read a number: ")
            arrNum[i] = inp.nextInt()
            i--
        }


        // Display the array
        Reverse(arrNum)
    }

    private fun Reverse(arr: IntArray) {
        var i = 0
        while (i < 10) {
            //Print angka dalam array
            println(arr[i])
            i++
        }
    }
}
