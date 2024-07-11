package IR

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = Array(4) { DoubleArray(4) }

    println("Enter a 4-by-4 row by row: ")
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            arr[i][j] = sc.nextDouble()
        }
        print("")
    }
    sumMajorDiagonal(arr)
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    val total = m[0][0] + m[1][1] + m[2][2] + m[3][3]
    println("Sum of the elements in the major diagonal is $total")
    return total
}

