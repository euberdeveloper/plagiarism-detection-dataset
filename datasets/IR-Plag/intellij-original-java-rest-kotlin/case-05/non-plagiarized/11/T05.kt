package IR

import java.util.*

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

object T05 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer: ")
        val angka = sc.nextInt()
        reverse(angka)
    }

    fun reverse(number: Int) {
        var number = number
        val tamp = number
        var hit = 0
        while (number != 0) {
            number = number / 10
            hit++
        }
        number = tamp
        var jumlah = 0
        for (i in hit downTo 1) {
            var jumlah10 = 1
            val akhir = number % 10
            for (j in 1 until i) {
                jumlah10 = jumlah10 * 10
            }
            jumlah = jumlah + (akhir * jumlah10)
            number = number / 10
        }
        println(jumlah)
    }
}
