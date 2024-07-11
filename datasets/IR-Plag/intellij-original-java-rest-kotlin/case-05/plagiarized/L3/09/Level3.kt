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
object Level3 {
    @JvmStatic
    fun main(args: Array<String>) {
        //cara lain memanggil scanner
        val input = Scanner(System.`in`)

        print("Enter an integer: ")
        val angka = input.nextInt()
        reverse(angka)
    }

    //fungsi membalik
    fun reverse(number: Int) {
        var number = number
        var sisa: Int
        while (number != 0) {
            sisa = number % 10
            print(sisa)
            number = number / 10
        }
        println()
    }
}
