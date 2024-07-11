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
object Level1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`) //harus import dulu
        print("Enter a 4 by 4 matrix row by row: ")
        val m = Array(4) { DoubleArray(4) }
        for (i in 0..3) {
            for (j in 0..3) {
                m[i][j] = input.nextDouble()
            }
        }
        print(
            "Sum of the elements in the major diagonal is "
                    + sumMajorDiagonal(m)
        )
    }

    //fungsi untuk menjumlahkan diagonal
    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in m.indices) {
            sum += m[i][i]
        }
        return sum
    }
}
