package IR

import java.util.Scanner

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    val input = Scanner(System.`in`)
    // Input angka ke dalam array n x n pada bagian ini
    println("Enter a 4 by 4 matrix row by row: ")
    val arr = Array(4) { DoubleArray(4) { input.nextDouble() } }
    // Menampilkan hasil dari pemanggilan fungsi sumMajorDiagonal
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(arr)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    // Menjumlahkan angka yang terdapat di dalam array
    return m.mapIndexed { i, row -> row[i] }.sum()
}

