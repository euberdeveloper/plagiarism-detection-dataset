package IR

import java.util.Scanner

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
fun sumMajorDiagonal(matrix: Array<DoubleArray>, n: Int) {
    var sum = 0.0
    val sc = Scanner(System.`in`)

    for (i in 0 until n) {
        for (j in 0 until n) {
            matrix[i][j] = sc.nextDouble()
        }
    }

    for (i in 0 until matrix.size) {
        sum += matrix[i][i]
    }
    println("Sum of the elements in the major diagonal is $sum")
}

fun main(args: Array<String>) {
    val n = 4
    println("Enter a 4 by 4 matrix row by row: ")
    val matrix = Array(n) { DoubleArray(n) }
    sumMajorDiagonal(matrix, n)
}

