package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D Afiany 2451041557A22145B3701B0184109CAB035
 */
object T07 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        val m = Array(4) { DoubleArray(4) }
        println("Enter a 4-by-4 matrix row by row: ")
        for (i in m.indices) {
            for (j in m.indices) {
                m[i][j] = sc.nextDouble()
            }
        }
        println(
            "Sum of the elements in the major diagonal is "
                    + sumMajorDiagonal(m)
        )
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        val tambah = m[0][0] + m[1][1] + m[2][2] + m[3][3]
        return tambah
    }
}
