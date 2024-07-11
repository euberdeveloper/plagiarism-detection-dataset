package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)

        //input 4*4 matrix data
        print("Enter a 4 by 4 matrix row by row: ")
        val mtx = Array(4) { DoubleArray(4) }

        for (i in 0..3) for (j in 0..3) mtx[i][j] = s.nextDouble()


        print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(mtx))
    }

    //function for Summary
    fun sumMajorDiagonal(mtx: Array<DoubleArray>): Double {
        var sum = 0.0

        for (i in mtx.indices) sum += mtx[i][i]
        return sum
    }
}
