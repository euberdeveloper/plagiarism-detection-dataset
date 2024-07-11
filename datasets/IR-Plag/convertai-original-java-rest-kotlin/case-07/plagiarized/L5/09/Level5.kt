package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val sc = Scanner(System.`in`)
    val matriks = Array(4) { DoubleArray(4) }

    print("Enter a 4 by 4 matrix row by row: ")
    for (bar in 0 until 4) {
        for (kol in 0 until 4) {
            matriks[bar][kol] = sc.nextDouble()
        }
    }

    hasil(matriks)
}

fun sum(x: Array<DoubleArray>): Double {
    var jumlah = 0.0
    var i = 0
    while (i < 4) {
        jumlah += x[i][i]
        i++
    }
    return jumlah
}

//fungsi output program
private fun hasil(x: Array<DoubleArray>) {
    println("Sum of the elements in the major diagonal is ${ sum(x) }")
}

