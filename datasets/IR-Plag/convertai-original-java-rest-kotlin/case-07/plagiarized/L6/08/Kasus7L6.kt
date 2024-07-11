package IR

import java.util.Scanner

fun main() {
    // minta input
    val inp = Scanner(System.`in`)
    val matrix = Array(4) { DoubleArray(4) }
    var i = 0
    var sum = 0.0
    println("Enter a 4 by 4 matrix row by row: ")

    // input the matrix
    while (i < 4) {
        var j = 0
        while (j < 4) {
            matrix[i][j] = inp.nextDouble()

            if (i == j) {
                sum += matrix[i][j]
            }

            j++
        }
        i++
    }

    println("Sum of the elements in the major diagonal is $sum")
}

