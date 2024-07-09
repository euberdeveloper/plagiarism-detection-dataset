package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
object T07 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        val m = Array(4) { DoubleArray(4) }

        println("Enter a 4-by-4 matrix row by row: ")

        for (i in m.indices) {
            for (j in m[0].indices) {
                m[i][j] = sc.nextDouble()
            }
        }

        println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m))
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in m.indices) {
            sum += m[i][i]
        }
        return sum
    }
}
