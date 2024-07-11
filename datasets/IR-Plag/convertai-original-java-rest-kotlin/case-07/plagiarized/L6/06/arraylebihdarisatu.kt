package IR

import java.util.Scanner

fun main() {
    println("Enter a 4 by 4 matrix row by row: ")

    println("Sum of the elements in the major diagonal is ${calculateDiagonal()}")
}

fun calculateDiagonal(): Double {
    val scanner = Scanner(System.`in`)
    var result = 0.0
    val matrix = Array(4) { DoubleArray(4) }

    for (x in 0 until 4) {
        for (y in 0 until 4) {
            matrix[x][y] = scanner.nextDouble()
            if (x == y) {
                result += matrix[x][y]
            }
        }
    }

    return result
}

