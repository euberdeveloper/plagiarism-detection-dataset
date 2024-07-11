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
        val angka = IntArray(10)
        for (i in 0..9) {
            // Input angka pada bagian ini
            print(
                "Read a number: "
            )
            angka[i] = input.nextInt()
        }
        showArray(angka)
    }

    fun showArray(angka: IntArray) {
        // Menampilkan array
        var i = 9
        while (i >= 0) {
            println(angka[i])
            i--
        }
    }
}
