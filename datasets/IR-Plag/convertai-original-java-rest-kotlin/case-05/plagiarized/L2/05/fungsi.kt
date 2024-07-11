package IR

import java.util.Scanner

fun main() {
    println("Enter an integer: ")
    val sc = Scanner(System.`in`)
    val input = sc.nextInt() // input integer
    terbalik(input) // memanggil fungsi reverse
}

fun terbalik(angka: Int) {
    var temp = angka
    while (temp != 0) { // looping sampai angka habis
        val sisa = temp % 10 // membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
        print(sisa)
        temp /= 10
    }
    println()
}

