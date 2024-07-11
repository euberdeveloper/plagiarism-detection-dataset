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
object Kasus7L5 {
    @JvmStatic
    fun main(args: Array<String>) {
        //minta input
        val inp = Scanner(System.`in`)
        val matrix = Array(4) { DoubleArray(4) }
        var i = 0
        var sum = 0.0
        print("Enter a 4 by 4 matrix row by row: ")

        //input the matrix
        while (i < 4) {
            var j = 0
            while (j < 4) {
                matrix[i][j] = inp.nextDouble()
                j++
            }
            i++
        }

        i = 0
        while (i < matrix.size) {
            sum += matrix[i][i]
            i++
        }

        print("Sum of the elements in the major diagonal is $sum")
    }
}
