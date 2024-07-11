package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 51BE04B11C5F2F5AD96A396632DC3F76
 */

object t06 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val arrNum = IntArray(10)
        for (i in 0..9) {
            print("Read a number: ")
            arrNum[i] = sc.nextInt()
        }
        for (i in 9 downTo -1 + 1) {
            println(arrNum[i])
        }
    }
}
