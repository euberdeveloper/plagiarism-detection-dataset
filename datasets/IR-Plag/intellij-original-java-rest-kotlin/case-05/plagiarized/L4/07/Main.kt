package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author Admin
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var angka: Int
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        angka = input.nextInt()
        // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
        while (angka != 0) {
            val remainder = angka % 10
            print(remainder)
            angka = angka / 10
        }
        println()
    }
}
