package IR

import java.util.Scanner

fun sumMajorDiagonal(mtx: Array<DoubleArray>): Double {
    var sum = 0.0
    for (i in mtx.indices) {
        sum += mtx[i][i]
    }
    return sum
}

fun main(args: Array<String>) {
    val mtx = Array(4) { DoubleArray(4) }
    val s = Scanner(System.`in`)
    println("Enter a 4 by 4 matrix row by row: ")

    for (i in mtx.indices) {
        for (j in mtx[i].indices) {
            mtx[i][j] = s.nextDouble()
        }
    }

    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(mtx)}")
}

