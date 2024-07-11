package IR

import java.util.Scanner

fun main() {
    // minta input
    val inp = Scanner(System.`in`)
    val matrix = Array(4) { DoubleArray(4) }
    println("Enter a 4 by 4 matrix row by row: ")

    // input the matrix
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            matrix[i][j] = inp.nextDouble()
        }
    }

    var sum = 0.0
    for (i in matrix.indices) {
        sum += matrix[i][i]
    }
    println("Sum of the elements in the major diagonal is $sum")
}

