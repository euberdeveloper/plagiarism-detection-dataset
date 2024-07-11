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
object Level3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val matriks = Array(4) { DoubleArray(4) }

        print("Enter a 4 by 4 matrix row by row: ")
        for (bar in 0..3) {
            for (kol in 0..3) {
                matriks[bar][kol] = scan.nextDouble()
            }
        }
        print(
            "Sum of the elements in the major diagonal is "
                    + diagonal(matriks)
        )
    }

    fun diagonal(x: Array<DoubleArray>): Double {
        var jumlah = 0.0
        for (i in x.indices) jumlah += x[i][i]
        return jumlah
    }
}
