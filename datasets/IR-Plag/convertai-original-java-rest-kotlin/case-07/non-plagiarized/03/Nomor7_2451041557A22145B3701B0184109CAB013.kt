package IR

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val matrix = Array(4) { IntArray(4) }
    var sum = 0
    println("Enter a 4-by-4 matrix row by row: ")
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            matrix[i][j] = sc.nextInt()
            if (i == j) {
                sum += matrix[i][j]
            }
        }
    }
    println("Sum of the elements in the major diagonal is $sum")
}

