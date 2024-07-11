package IR

import java.util.*

object T07 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val numbers = Array(4) { DoubleArray(4) }
        println("Enter a 4-by4 matrix row by row:")

        for (i in 0..3) {
            val rows = sc.nextLine()
            val rowssplit = rows.split("\\s+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            for (j in 0..3) {
                numbers[i][j] = rowssplit[j].toDouble()
            }
        }
        println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(numbers))
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        var jumdiagonal = 0.0
        for (i in 0..3) {
            for (j in 0..3) {
                if (i == j) {
                    jumdiagonal = jumdiagonal + m[i][j]
                }
            }
        }
        return jumdiagonal
    }
}