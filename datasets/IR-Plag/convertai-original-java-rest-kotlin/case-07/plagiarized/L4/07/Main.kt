package IR

import java.util.Scanner

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    val arr = Array(4) { DoubleArray(4) }
    val input = Scanner(System.`in`)
    // Input angka ke dalam array n x n pada bagian ini
    println("Enter a 4 by 4 matrix row by row: ")
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            arr[i][j] = input.nextDouble()
        }
    }
    // Menjumlahkan angka yang terdapat di dalam array
    var sum = 0.0
    for (i in 0 until arr.size) {
        sum += arr[i][i]
    }
    // Menampilkan hasil dari pemanggilan fungsi sumMajorDiagonal
    println("Sum of the elements in the major diagonal is $sum")
}

