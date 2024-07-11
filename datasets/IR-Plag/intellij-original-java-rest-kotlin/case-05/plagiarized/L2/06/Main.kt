package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val angka = input.nextInt()
        // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
        reverse(angka)
    }

    fun reverse(angka: Int) {
        // Di sini mengulang hingga number habis
        var angka = angka
        while (angka != 0) {
            val remainder = angka % 10
            print(remainder)
            angka = angka / 10
        }
        println()
    }
}
