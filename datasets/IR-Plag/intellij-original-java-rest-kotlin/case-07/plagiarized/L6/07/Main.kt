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
        val arr = Array(4) { DoubleArray(4) }
        for (i in 0..3) {
            for (j in 0..3) {
                arr[i][j] = input.nextDouble()
            }
        }
        // Menjumlahkan angka yang terdapat di dalam array
        var sum = 0.0
        var i = 0
        while (i < arr.size) {
            sum += arr[i][i]
            i = i + 1
        }
        // Menampilkan hasil dari pemanggilan fungsi sumMajorDiagonal
        print(
            "Sum of the elements in the major diagonal is "
                    + sum
        )
    }
}