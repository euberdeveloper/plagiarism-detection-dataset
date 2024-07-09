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
object Kasus5L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        //input data
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val number = input.nextInt()
        reverse(number)
    }

    fun reverse(number: Int) {
        //proses membalikkan angka
        var number = number
        while (number != 0) {
            //mengambil angka terakhir
            val remainder = number % 10
            //tampilkan angka yang diambil
            print(remainder)
            //membuang angka terakhir
            number = number / 10
        }
        println()
    }
}
