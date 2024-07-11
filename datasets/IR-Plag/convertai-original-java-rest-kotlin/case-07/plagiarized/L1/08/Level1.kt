package IR

import java.util.Scanner

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val input = Scanner(System.`in`) //harus import dulu
    println("Enter a 4 by 4 matrix row by row: ")
    val m = Array(4) { DoubleArray(4) }
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            m[i][j] = input.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}")
}

//fungsi untuk menjumlahkan diagonal
fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var sum = 0.0
    for (i in 0 until m.size) {
        sum += m[i][i]
    }
    return sum
}

