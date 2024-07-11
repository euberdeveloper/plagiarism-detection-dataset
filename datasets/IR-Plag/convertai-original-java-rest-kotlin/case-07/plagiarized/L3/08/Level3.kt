package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val matriks = Array(4) { DoubleArray(4) }

        print("Enter a 4 by 4 matrix row by row: ")
        for (bar in 0 until 4) {
            for (kol in 0 until 4) {
                matriks[bar][kol] = scan.nextDouble()
            }
        }
        println("Sum of the elements in the major diagonal is ${diagonal(matriks)}")
    }

    private fun diagonal(x: Array<DoubleArray>): Double {
        var jumlah = 0.0
        for (i in x.indices)
            jumlah += x[i][i]
        return jumlah
    }
}

