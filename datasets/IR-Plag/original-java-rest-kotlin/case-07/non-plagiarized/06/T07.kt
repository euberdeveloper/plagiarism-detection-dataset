package IR

import java.util.*

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
object T07 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val matrix = Array(4) { DoubleArray(4) }
        println("Enter a 4-by-4 matrix row to row : ")
        for (i in 0..3) {
            for (j in 0..3) {
                matrix[i][j] = sc.nextDouble()
            }
        }
        val result = sumMajorDiagonal(matrix)
        println("Sum of the element in the major diagonal is $result")
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var result = 0.0
        for (i in 0..3) {
            result += m[i][i]
        }
        return result
    }
}
