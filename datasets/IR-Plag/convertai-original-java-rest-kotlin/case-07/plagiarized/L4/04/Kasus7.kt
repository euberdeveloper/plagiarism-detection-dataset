package IR

import java.util.Scanner

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
fun inputMatrix(matrix: Array<DoubleArray>, n: Int) {
    val sc = Scanner(System.`in`)

    for (i in 0 until n) {
        for (j in 0 until n) {
            matrix[i][j] = sc.nextDouble()
        }
    }
}

fun sumMajorDiagonal(matrix: Array<DoubleArray>) {
    var sum = 0.0
    for (i in matrix.indices) {
        sum += matrix[i][i]
    }
    println("Sum of the elements in the major diagonal is $sum")
}

fun main(args: Array<String>) {
    val n = 4
    println("Enter a 4 by 4 matrix row by row: ")
    val matrix = Array(n) { DoubleArray(n) }

    inputMatrix(matrix, n)
    sumMajorDiagonal(matrix)
}

