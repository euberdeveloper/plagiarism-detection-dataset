package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus7 {
    fun sumMajorDiagonal(matrix: Array<DoubleArray>, n: Int) {
        var sum = 0.0
        val sc = Scanner(System.`in`)

        for (i in 0 until n) {
            var j = 0
            while (j < n) {
                matrix[i][j] = sc.nextDouble()
                j++
            }
        }

        for (i in matrix.indices) {
            sum += matrix[i][i]
        }
        println("Sum of the elements in the major diagonal is $sum")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val n = 4
        print("Enter a 4 by 4 matrix row by row: ")
        val matrix = Array(n) { DoubleArray(n) }

        sumMajorDiagonal(matrix, n)
    }
}
