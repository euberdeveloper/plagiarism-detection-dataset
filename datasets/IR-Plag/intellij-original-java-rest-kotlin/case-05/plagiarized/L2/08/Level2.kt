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
object Level2 {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val `in` = Scanner(System.`in`)
        val angka = `in`.nextInt()
        balik(angka)
    }

    //fungsi membalik
    fun balik(angka: Int) {
        var angka = angka
        while (angka != 0) {
            val sisa = angka % 10
            print(sisa)
            angka = angka / 10
        }
        println()
    }
}
