package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus7L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        //minta input
        val input = Scanner(System.`in`)
        print("Enter a 4 by 4 matrix row by row: ")
        val m = Array(4) { DoubleArray(4) }
        //input the matrix
        for (i in 0..3) {
            for (j in 0..3) {
                m[i][j] = input.nextDouble()
            }
        }
        print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m))
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in m.indices) {
            sum += m[i][i]
        }
        return sum
    }
}
