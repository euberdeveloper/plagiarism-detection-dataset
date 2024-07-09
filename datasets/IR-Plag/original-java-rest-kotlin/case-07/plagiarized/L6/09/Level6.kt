package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val masukkan = Scanner(System.`in`)
        val mat = Array(4) { DoubleArray(4) }

        print("Enter a 4 by 4 matrix row by row: ")
        var baris = 0
        while (baris < 4) {
            var kolom = 0
            while (kolom < 4) {
                mat[baris][kolom] = masukkan.nextDouble()
                kolom += 1
            }
            baris += 1
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
        print("Sum of the elements in the major diagonal is $jumlah")
    }
}
