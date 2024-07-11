package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    println("Enter a 4 by 4 matrix row by row: ")
    val matrix = Array(4) { DoubleArray(4) }

    for (x in 0 until 4) {
        for (y in 0 until 4) {
            matrix[x][y] = sc.nextDouble()
        }
    }

    println("Sum of the elements in the major diagonal is ${calculateDiagonal(matrix)}")
}

fun calculateDiagonal(matrix: Array<DoubleArray>): Double {
    var total = 0.0
    for (i in matrix.indices) {
        total += matrix[i][i]
    }
    return total
}

