package IR

import java.util.Scanner

fun main() {
    // minta input
    val inp = Scanner(System.`in`)
    println("Enter a 4 by 4 matrix row by row: ")
    val matrix = Array(4) { DoubleArray(4) }
    // input the matrix
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            matrix[i][j] = inp.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${jumlahDiagonalKanan(matrix)}")
}

fun jumlahDiagonalKanan(matrix: Array<DoubleArray>): Double {
    var sum = 0.0
    for (i in 0 until matrix.size) {
        sum += matrix[i][i]
    }
    return sum
}

