package IR

import java.util.*

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
object No7 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val matrix = Array(4) { DoubleArray(4) }
        val sc = Scanner(System.`in`)
        println("Enter a 4-by-4 matrix row by row")
        for (i in 0..3) {
            for (j in 0..3) {
                matrix[i][j] = sc.nextDouble()
            }
        }
        println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix))
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in 0..3) {
            sum += m[i][i]
        }
        return sum
    }
}
