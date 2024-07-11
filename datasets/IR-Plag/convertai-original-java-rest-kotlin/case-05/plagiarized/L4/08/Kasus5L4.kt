package IR

import java.util.Scanner

fun main() {
    // input data
    val inp = Scanner(System.`in`)
    println("Enter an integer: ")
    val angka = inp.nextInt()

    // proses membalikkan angka
    var temp: Int
    var reversedNumber = 0
    var currentNumber = angka
    while (currentNumber != 0) {
        // mengambil angka terakhir
        temp = currentNumber % 10
        // membuang angka terakhir
        currentNumber /= 10
        // tampilkan angka yang diambil
        print(temp)
    }
    println()
}

