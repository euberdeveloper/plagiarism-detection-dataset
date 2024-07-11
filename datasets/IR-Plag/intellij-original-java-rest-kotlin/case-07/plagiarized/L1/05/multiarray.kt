package IR

import java.util.*

object multiarray {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)


        print("Enter a 4 by 4 matrix row by row: ")
        val m = Array(4) { DoubleArray(4) } //inisialisai array 2 dimensi

        for (i in 0..3) {
            for (j in 0..3) {
                m[i][j] = input.nextDouble() //menginput angka ke dalam array 2d
            }
        }

        print("Sum of the elements in the major  diagonal is  " + sumMajorDiagonal(m)) //menampilkan fungsi hasil perhitungan diagonal
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double { //fungsi untuk mengitung diagonal
        var sum = 0.0
        for (i in m.indices) {
            sum += m[i][i]
        }
        return sum
    }
}
