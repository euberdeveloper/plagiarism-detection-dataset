package IR

import java.util.*

object L5 {
    fun jumlahDiagonal(m: Array<DoubleArray>): Double {
        var sum = 0.0
        var hit = 0
        while (hit != m.size) {
            sum += m[hit][hit]
            hit++
        }
        return sum
    }

    fun print(m: Array<DoubleArray>) {
        println("Sum of the elements in the major diagonal is $jumlahDiagonal(m)")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val m = Array(4) { DoubleArray(4) }
        println("Enter a 4 by 4 matrix row by row: ")
        for (i in 0 until 4) {
            for (j in 0 until 4) {
                m[i][j] = sc.nextDouble()
            }
        }
        print(m)
    }
}

