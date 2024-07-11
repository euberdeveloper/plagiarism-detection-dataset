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
object Level2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter a 4 by 4 matrix row by row: ")
        val matrix = Array(4) { DoubleArray(4) }
        for (x in 0..3) {
            for (y in 0..3) {
                matrix[x][y] = sc.nextDouble()
            }
        }
        print(
            "Sum of the elements in the major diagonal is "
                    + hitungDiagonal(matrix)
        )
    }

    fun hitungDiagonal(matrix: Array<DoubleArray>): Double {
        var jumlah = 0.0
        for (i in matrix.indices) {
            jumlah += matrix[i][i]
        }
        return jumlah
    }
}
