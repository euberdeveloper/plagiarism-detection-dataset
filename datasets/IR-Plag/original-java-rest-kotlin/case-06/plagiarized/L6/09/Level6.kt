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
object Level6 {
    var sc: Scanner = Scanner(System.`in`)

    fun tampil(angka: IntArray) {
        for (x in 10 downTo 1) println(angka[x])
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arrAngka = IntArray(10)

        for (x in arrAngka.indices) {
            print("Read a number: ")
            arrAngka[x] = sc.nextInt()
        }

        tampil(arrAngka)
    }
}
