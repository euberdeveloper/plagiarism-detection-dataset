package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
object T07 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        println("Enter a 4-by-4 matrix row by row")
        val a = Array(4) { DoubleArray(4) }
        for (i in 0..3) {
            for (j in 0..3) {
                a[i][j] = s.nextDouble()
            }
        }
        println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(a))
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in 0..3) {
            for (j in 0..3) {
                if (i == j) sum += m[i][j]
            }
        }

        return sum
    }
}
