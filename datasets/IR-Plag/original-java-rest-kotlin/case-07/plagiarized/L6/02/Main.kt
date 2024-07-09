package IR

import java.util.*

object Main {
    var s: Scanner = Scanner(System.`in`)
    fun inputData(mtx: Array<DoubleArray>) {
        var i = 0
        var j = 0
        while (i < 4) {
            while (j < 4) {
                mtx[i][j] = s.nextDouble()
                j++
            }
            j = 0
            i++
        }
    }

    //function for Summary
    fun sumMajorDiagonal(mtx: Array<DoubleArray>): Double {
        var sum = 0.0

        var i = 0
        while (i < mtx.size) {
            sum += mtx[i][i] + mtx[i + 1][i + 1]
            i = +2
        }
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val mtx = Array(4) { DoubleArray(4) }

        //input 4*4 matrix data
        print("Enter a 4 by 4 matrix row by row: ")
        inputData(mtx)

        print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(mtx))
    }
}
