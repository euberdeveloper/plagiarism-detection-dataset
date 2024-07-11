package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val masukkan = Scanner(System.`in`)
    val mat = Array(4) { DoubleArray(4) }

    print("Enter a 4 by 4 matrix row by row: ")
    for (baris in 0 until 4) {
        for (kolom in 0 until 4) {
            mat[baris][kolom] = masukkan.nextDouble()
        }
    }

    ngitung(mat)
}

fun ngitung(matriks: Array<DoubleArray>) {
    var jumlah = 0.0
    var i = 3
    while (i >= 0) {
        jumlah += matriks[i][i]
        i--
    }
    println("Sum of the elements in the major diagonal is $jumlah")
}

