package IR

import java.util.*

/**
 *
 * @author 2645BB47F923271FA1FC06C04E9691EA
 */
object Soal7 {
    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var hasil = 0.0
        for (i in 0..3) {
            for (j in 0..3) {
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
        val sc = Scanner(System.`in`)
        for (i in 0..3) {
            for (j in 0..3) {
                m[i][j] = sc.nextDouble()
            }
        }
        println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m))
    }
}
