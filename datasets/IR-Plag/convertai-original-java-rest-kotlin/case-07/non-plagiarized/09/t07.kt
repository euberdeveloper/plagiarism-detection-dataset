package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val matriks = Array(4) { DoubleArray(4) }
    println("Enter a 4-by-4 matrix row by row: ")
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            matriks[i][j] = sc.nextDouble()
        }
    }

    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(matriks)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var hasil = 0.0
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            if (i == j) {
                hasil += m[i][j]
            }
        }
    }
    return hasil
}

