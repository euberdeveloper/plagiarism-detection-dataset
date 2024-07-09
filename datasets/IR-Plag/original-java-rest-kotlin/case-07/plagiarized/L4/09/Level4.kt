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
object Level4 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        val matriks = Array(4) { DoubleArray(4) }
        var sum = 0.0

        print("Enter a 4 by 4 matrix row by row: ")
        for (b in 0..3) {
            for (k in 0..3) {
                matriks[b][k] = `in`.nextDouble()
            }
        }

        for (x in matriks.indices) {
            sum += matriks[x][x]
        }

        print("Sum of the elements in the major diagonal is $sum")
    }
}
