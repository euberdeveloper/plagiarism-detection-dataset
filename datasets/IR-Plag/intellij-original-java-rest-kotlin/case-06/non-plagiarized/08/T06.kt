package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
object T06 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val a = IntArray(10)
        for (i in 0..9) {
            print("Read a number")
            a[i] = sc.nextInt()
        }
        for (i in 0..9) {
            println(a[9 - i])
        }
    }
}
