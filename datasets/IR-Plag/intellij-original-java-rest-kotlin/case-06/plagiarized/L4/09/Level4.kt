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
object Level4 {
    @JvmStatic
    fun main(args: Array<String>) {
        proses()
    }

    fun proses() {
        val `in` = Scanner(System.`in`)
        val angka = IntArray(10)
        for (a in 0..9) {
            print("Read a number: ")
            angka[a] = `in`.nextInt()
        }

        for (b in 9 downTo 0) {
            println(angka[b])
        }
    }
}
