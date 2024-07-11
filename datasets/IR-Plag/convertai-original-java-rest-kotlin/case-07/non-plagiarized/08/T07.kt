package IR

import java.util.Scanner

/**
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
object T07 {
    private val sc = Scanner(System.`in`)

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var hasil = 0.0
        for (i in 0 until 4) {
            for (j in 0 until 4) {
                m[i][j] = sc.nextDouble()
                if (i == j) {
                    hasil += m[i][j]
                }
            }
        }
        return hasil
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val m = Array(4) { DoubleArray(4) }
        println("Enter a 4-by-4 matrix row by row:")
        println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}")
    }
}

