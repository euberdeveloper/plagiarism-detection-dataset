package IR

import java.util.Scanner

/**
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D Afiany 2451041557A22145B3701B0184109CAB035
 */
fun main() {
    val sc = Scanner(System.`in`)

    val m = Array(4) { DoubleArray(4) }
    println("Enter a 4-by-4 matrix row by row: ")
    for (i in m.indices) {
        for (j in m[i].indices) {
            m[i][j] = sc.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var tambah = 0.0
    for (i in m.indices) {
        tambah += m[i][i]
    }
    return tambah
}

