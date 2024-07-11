package IR

import java.util.Scanner

/**
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
fun main() {
    val s = Scanner(System.`in`)
    println("Enter a 4-by-4 matrix row by row")
    val a = Array(4) { DoubleArray(4) }
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            a[i][j] = s.nextDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(a)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var sum = 0.0
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            if (i == j)
                sum += m[i][j]
        }
    }
    return sum
}

