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
        val `in` = Scanner(System.`in`)
        val arrAngka = IntArray(10)

        for (x in 0..9) {
            print(
                "Read a number: "
            )
            arrAngka[x] = `in`.nextInt()
        }

        for (x in 9 downTo 0) {
            println(arrAngka[x])
        }
    }
}
