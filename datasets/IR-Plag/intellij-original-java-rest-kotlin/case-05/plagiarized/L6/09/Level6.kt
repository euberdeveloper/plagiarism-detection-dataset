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
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val bil = input.nextInt()

        rekursif(bil)
        println("")
    }

    //rekursif ah...
    fun rekursif(bil: Int): Int {
        var bil = bil
        if (bil != 0) {
            val sisaMod = bil % 10
            print(sisaMod)
            bil = bil / 10
            rekursif(bil)
        }
        return bil
    }
}
