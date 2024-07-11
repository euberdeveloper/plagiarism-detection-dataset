package IR

import java.util.Scanner

fun main() {
    // input data
    val inp = Scanner(System.`in`)
    println("Enter an integer: ")
    val angka = inp.nextInt()

    // proses membalikkan angka
    var temp = angka
    while (temp != 0) {
        // tampilkan angka yang diambil
        print(temp % 10)
        // membuang angka terakhir
        temp /= 10
    }
    println()
}

