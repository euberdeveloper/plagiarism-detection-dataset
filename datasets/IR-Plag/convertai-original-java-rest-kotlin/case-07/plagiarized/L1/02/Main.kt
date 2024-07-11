package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    // input 4*4 matrix data
    println("Enter a 4 by 4 matrix row by row: ")
    val m = Array(4) { DoubleArray(4) { input.nextDouble() } }

    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var sum = 0.0

    for (i in m.indices)
        sum += m[i][i]
    return sum
}

