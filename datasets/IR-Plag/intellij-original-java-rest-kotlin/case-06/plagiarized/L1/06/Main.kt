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
        val input = Scanner(System.`in`)
        val num = IntArray(10)
        for (i in 0..9) {
            // Input angka pada bagian ini
            print(
                "Read a number: "
            )
            num[i] = input.nextInt()
        }
        // Menampilkan array
        for (i in 9 downTo 0) {
            println(num[i])
        }
    }
}
