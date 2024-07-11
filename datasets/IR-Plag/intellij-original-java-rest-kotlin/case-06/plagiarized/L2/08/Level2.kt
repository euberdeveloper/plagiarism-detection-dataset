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
        val masukkan = Scanner(System.`in`)
        val number = IntArray(10)


        //masukkan data
        for (a in 0..9) {
            print(
                "Read a number: "
            )
            number[a] = masukkan.nextInt()
        }

        //tampilkan ke layar
        for (a in 9 downTo 0) {
            println(number[a])
        }
    }
}
