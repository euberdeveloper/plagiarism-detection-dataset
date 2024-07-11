package IR

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer: ")
    val angka = sc.nextInt()
    reverse(angka)
}

fun reverse(number: Int) {
    var tamp = number
    var hit = 0
    while (tamp != 0) {
        tamp /= 10
        hit++
    }
    tamp = number
    var jumlah = 0
    for (i in hit downTo 1) {
        var jumlah10 = 1
        val akhir = tamp % 10
        for (j in 1 until i) {
            jumlah10 *= 10
        }
        jumlah += akhir * jumlah10
        tamp /= 10
    }
    println(jumlah)
}

