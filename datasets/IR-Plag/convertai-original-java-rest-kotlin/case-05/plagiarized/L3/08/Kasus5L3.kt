package IR

import java.util.Scanner

fun main() {
    // input data
    val inp = Scanner(System.`in`)
    print("Enter an integer: ")
    val angka = inp.nextInt()
    reverseNumber(angka)
}

fun reverseNumber(angka: Int) {
    // proses membalikkan angka
    var num = angka
    while (num != 0) {
        // mengambil angka terakhir
        val temp = num % 10
        // membuang angka terakhir
        num /= 10
        // tampilkan angka yang diambil
        print(temp)
    }
    println()
}

