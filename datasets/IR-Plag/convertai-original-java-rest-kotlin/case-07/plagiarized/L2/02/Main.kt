package IR

import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)

    // input 4*4 matrix data
    println("Enter a 4 by 4 matrix row by row: ")
    val mtx = Array(4) { DoubleArray(4) }

    for (i in 0 until 4)
        for (j in 0 until 4)
            mtx[i][j] = s.nextDouble()

    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(mtx)}")
}

fun sumMajorDiagonal(mtx: Array<DoubleArray>): Double {
    var sum = 0.0

    for (i in mtx.indices)
        sum += mtx[i][i]
    return sum
}

