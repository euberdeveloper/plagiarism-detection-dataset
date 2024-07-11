package IR

import java.util.*

object L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter a 4 by 4 matrix row by row: ")
        val m = Array(4) { DoubleArray(4) }
        for (i in 0..3) {
            for (j in 0..3) {
                m[i][j] = sc.nextDouble()
            }
        }
        print("Sum of the elements in the major diagonal is " + jumlahDiagonal(m))
    }

    fun jumlahDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in m.indices) {
            sum += m[i][i]
        }
        return sum
    }
}
