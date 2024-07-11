package IR

import java.util.Scanner

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
fun main(args: Array<String>) {
    val matrix = Array(4) { DoubleArray(4) }
    val sc = Scanner(System.`in`)
    println("Enter a 4-by-4 matrix row by row")
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            matrix[i][j] = sc.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(matrix)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var sum = 0.0
    for (i in 0 until 4) {
        sum += m[i][i]
    }
    return sum
}

