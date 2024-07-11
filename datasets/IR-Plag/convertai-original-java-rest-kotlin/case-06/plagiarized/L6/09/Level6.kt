package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    private val sc = Scanner(System.`in`)

    @JvmStatic
    fun tampil(angka: IntArray) {
        for (x in 9 downTo 0) {
            println(angka[x])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val arrAngka = IntArray(10)

        for (x in arrAngka.indices) {
            print("Read a number: ")
            arrAngka[x] = sc.nextInt()
        }

        tampil(arrAngka)
    }
}

