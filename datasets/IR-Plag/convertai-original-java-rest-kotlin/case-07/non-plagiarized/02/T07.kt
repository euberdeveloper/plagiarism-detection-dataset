package IR

import java.util.Scanner

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
fun main() {
    val s = Scanner(System.`in`)
    println("Enter a 4-by-4 matrix row by row:")
    val m = Array(4) { DoubleArray(4) }
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            m[i][j] = s.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var temp = 0.0
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            if (i == j) {
                temp += m[i][j]
            }
        }
    }
    return temp
}

