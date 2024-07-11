package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val numbers = Array(4) { DoubleArray(4) }
    println("Enter a 4-by4 matrix row by row:")

    for (i in 0 until 4) {
        val rows = sc.nextLine()
        val rowsSplit = rows.split("\\s+".toRegex())
        for (j in 0 until 4) {
            numbers[i][j] = rowsSplit[j].toDouble()
        }
    }
    println("Sum of the elements in the major diagonal is ${sumMajorDiagonal(numbers)}")
}

fun sumMajorDiagonal(m: Array<DoubleArray>): Double {
    var jumDiagonal = 0.0
    for (i in 0 until 4) {
        for (j in 0 until 4) {
            if (i == j) {
                jumDiagonal += m[i][j]
            }
        }
    }
    return jumDiagonal
}

