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
object Level5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`) //panggil dari package
        val arrAngka = IntArray(10)

        for (x in 0..9) {
            print("Read a number: ")
            arrAngka[x] = sc.nextInt()
        }

        for (x in 9 downTo 0) println(arrAngka[x])
    }
}
