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
object T05 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        print("Enter an integer ")
        val a = s.nextInt()
        reverse(a)
    }

    fun reverse(number: Int) {
        val cek = number.toString()
        for (i in 0 until cek.length) {
            print(cek[cek.length - 1 - i])
        }
        println("")
    }
}
