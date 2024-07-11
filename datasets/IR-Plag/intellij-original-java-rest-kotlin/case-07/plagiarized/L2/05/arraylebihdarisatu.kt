package IR

import java.util.*

object arraylebihdarisatu {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)


        print("Enter a 4 by 4 matrix row by row: ")
        val matrix = Array(4) { DoubleArray(4) } //inisialisai array 2 dimensi

        for (x in 0..3) {
            for (y in 0..3) {
                matrix[x][y] = sc.nextDouble() //menginput angka ke dalam array 2d
            }
        }

        print("Sum of the elements in the major  diagonal is  " + HitungDiagonal(matrix)) //menampilkan fungsi hasil perhitungan diagonal
    }

    fun HitungDiagonal(matriks: Array<DoubleArray>): Double { //fungsi untuk mengitung diagonal
        var total = 0.0
        for (i in matriks.indices) {
            total += matriks[i][i]
        }
        return total
    }
}
