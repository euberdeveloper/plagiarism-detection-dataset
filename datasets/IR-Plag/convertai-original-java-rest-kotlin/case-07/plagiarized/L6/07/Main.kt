package IR

import java.util.Scanner

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    val arr = Array(4) { DoubleArray(4) }
    val input = Scanner(System.`in`)
    println("Enter a 4 by 4 matrix row by row: ")
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            arr[i][j] = input.nextDouble()
        }
    }

    var sum = 0.0
    for (i in 0 until arr.size) {
        sum += arr[i][i]
    }

    println("Sum of the elements in the major diagonal is $sum")
}

