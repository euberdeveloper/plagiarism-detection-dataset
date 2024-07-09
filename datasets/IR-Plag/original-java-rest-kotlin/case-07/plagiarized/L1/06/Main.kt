package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        // Input angka ke dalam array n x n pada bagian ini
        print("Enter a 4 by 4 matrix row by row: ")
        val m = Array(4) { DoubleArray(4) }
        for (i in 0..3) {
            for (j in 0..3) {
                m[i][j] = input.nextDouble()
            }
        }
        // Menampilkan hasil dari pemanggilan fungsi sumMajorDiagonal
        print(
            "Sum of the elements in the major diagonal is "
                    + sumMajorDiagonal(m)
        )
    }

    fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
        // Menjumlahkan angka yang terdapat di dalam array
        var sum = 0.0
        for (i in m.indices) {
            sum += m[i][i]
        }
        return sum
    }
}
