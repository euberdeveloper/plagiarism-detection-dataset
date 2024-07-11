package IR

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter a 4 by 4 matrix row by row: ")
    val m = Array(4) { DoubleArray(4) }
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            m[i][j] = sc.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${jumlahDiagonal(m)}")
}

fun jumlahDiagonal(m: Array<DoubleArray>): Double {
    var sum = 0.0
    for (i in m.indices) {
        sum += m[i][i]
    }
    return sum
}

