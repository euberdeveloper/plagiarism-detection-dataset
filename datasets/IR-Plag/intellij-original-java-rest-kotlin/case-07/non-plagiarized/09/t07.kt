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

object t07 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val matriks = Array(4) { DoubleArray(4) }
        println("Enter a 4-by-4 matrix row by row: ")
        for (i in 0..3) {
            for (j in 0..3) {
                matriks[i][j] = sc.nextDouble()
            }
        }

        println(
            "Sum of the elements in the major diagonal is "
                    + sumMajorDiagonal(matriks)
        )
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var hasil = 0.0
        for (i in 0..3) {
            for (j in 0..3) {
                if (i == j) {
                    hasil += m[i][j]
                }
            }
        }
        return hasil
    }
}
