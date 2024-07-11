package IR

import java.util.Scanner

fun main() {
    println("Enter an integer: ")
    val sc = Scanner(System.`in`)
    val input = sc.nextInt() // input integer
    terbalik(input) // memanggil fungsi reverse
}

fun terbalik(angka: Int) {
    var tempAngka = angka
    while (tempAngka != 0) { // looping sampai angka habis
        val sisa = tempAngka % 10 // membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
        print(sisa)
        tempAngka /= 10
    }
    println()
}

