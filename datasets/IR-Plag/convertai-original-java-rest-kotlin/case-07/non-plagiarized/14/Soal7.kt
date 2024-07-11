package IR

import java.util.Scanner

/**
 *
 * @author 2645BB47F923271FA1FC06C04E9691EA
 */
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

fun main(args: Array<String>) {
    val m = Array(4) { DoubleArray(4) }
    val sc = Scanner(System.`in`)
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            m[i][j] = sc.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}")
}

