package IR

import java.util.Scanner

object Main {
    private val s = Scanner(System.`in`)

    fun inputData(mtx: Array<DoubleArray>) {
        for (i in mtx.indices)
            for (j in mtx[i].indices)
                mtx[i][j] = s.nextDouble()
    }

    // function for Summary
    fun sumMajorDiagonal(mtx: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in mtx.indices)
            sum += mtx[i][i]
        return sum
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val mtx = Array(4) { DoubleArray(4) }

        // input 4*4 matrix data
        println("Enter a 4 by 4 matrix row by row: ")
        inputData(mtx)

        println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(mtx)}")
    }
}

