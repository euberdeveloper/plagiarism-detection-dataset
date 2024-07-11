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
object Level1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val num = IntArray(10)
        for (i in 0..9) {
            print(
                "Read a number: "
            )
            num[i] = input.nextInt()
        }


        //tampilkan ke layar
        for (i in 9 downTo 0) {
            println(num[i])
        }
    }
}
