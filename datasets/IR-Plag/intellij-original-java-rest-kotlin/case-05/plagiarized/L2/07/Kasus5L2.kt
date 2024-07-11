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
object Kasus5L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        //input data
        print("Enter an integer: ")
        val inp = Scanner(System.`in`)
        val angka = inp.nextInt()
        reverseNumber(angka)
    }

    fun reverseNumber(angka: Int) {
        //proses membalikkan angka
        var angka = angka
        while (angka != 0) {
            //mengambil angka terakhir
            val temp = angka % 10
            //tampilkan angka yang diambil
            print(temp)
            //membuang angka terakhir
            angka = angka / 10
        }
        println()
    }
}
