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

object t05 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer: ")
        val num = sc.nextInt()
        reverse(num)
    }

    fun reverse(number: Int) {
        val tmpNumber = number.toString()
        for (i in tmpNumber.length - 1 downTo -1 + 1) {
            print(tmpNumber[i])
        }
        println("")
    }
}
