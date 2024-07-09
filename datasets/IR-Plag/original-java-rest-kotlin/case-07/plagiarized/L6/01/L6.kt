package IR

import java.util.*

object L6 {
    fun jumlahDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        var hit = m.size - 1

        while (hit >= 0) {
            sum += m[hit][hit]
            hit--
        }
        return sum
    }

    fun print(m: Array<DoubleArray?>?) {
        print("Sum of the elements in the major diagonal is " + jumlahDiagonal(m))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val m = Array(4) { DoubleArray(4) }
        println("Enter a 4 by 4 matrix row by row: ")

        for (i in 3 downTo 0) {
            for (j in 3 downTo 0) {
                m[i][j] = sc.nextDouble()
            }
        }
        L6.print(m)
    }
}
