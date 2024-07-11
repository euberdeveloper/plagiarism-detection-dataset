package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
object T06 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        val a = IntArray(10)
        for (i in a.indices) {
            print("Read a number: ")
            a[i] = s.nextInt()
        }
        for (i in a.indices.reversed()) {
            println(a[i])
        }
    }
}
