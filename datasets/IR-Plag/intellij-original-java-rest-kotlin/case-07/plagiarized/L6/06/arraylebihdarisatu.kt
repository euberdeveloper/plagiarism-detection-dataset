package IR

import java.util.*

object arraylebihdarisatu {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter a 4 by 4 matrix row by row: ")





        print("Sum of the elements in the major  diagonal is  " + HitungDiagonal()) //menampilkan fungsi hasil perhitungan diagonal
    }

    fun HitungDiagonal(): Double { //fungsi untuk mengitung diagonal
        val sc = Scanner(System.`in`)
        var hasil = 0.0
        val matrix = Array(4) { DoubleArray(4) } //inisialisai array 2 dimensi
        for (x in 0..3) {
            for (y in 0..3) {
                matrix[x][y] = sc.nextDouble() //menginput angka ke dalam array 2d
                if (x == y) {
                    hasil += matrix[x][y]
                }
            }
        }
        return hasil
    }
}
