package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter a 4 by 4 matrix row by row: ")
        val matrix = Array(4) { DoubleArray(4) }
        for (x in 0 until 4) {
            for (y in 0 until 4) {
                matrix[x][y] = sc.nextDouble()
            }
        }
        println("Sum of the elements in the major diagonal is ${hitungDiagonal(matrix)}")
    }

    private fun hitungDiagonal(matrix: Array<DoubleArray>): Double {
        var jumlah = 0.0
        for (i in matrix.indices) {
            jumlah += matrix[i][i]
        }
        return jumlah
    }
}

