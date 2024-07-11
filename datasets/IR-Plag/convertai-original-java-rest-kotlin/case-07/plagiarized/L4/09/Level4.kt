package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val `in` = Scanner(System.`in`)
    val matriks = Array(4) { DoubleArray(4) }
    var sum = 0.0

    print("Enter a 4 by 4 matrix row by row: ")
    for (b in 0 until 4) {
        for (k in 0 until 4) {
            matriks[b][k] = `in`.nextDouble()
        }
    }

    for (x in matriks.indices) {
        sum += matriks[x][x]
    }

    println("Sum of the elements in the major diagonal is $sum")
}

