package IR

import java.util.ArrayList
import java.util.Scanner

fun main() {
    println("Enter an integer: ")
    val sc = Scanner(System.`in`)
    val input = sc.nextInt() // input integer
    terbalik(input) // memanggil fungsi reverse
}

fun terbalik(angka: Int) {
    val arr = ArrayList<Int>()
    var tempAngka = angka
    while (tempAngka > 0) { // looping sampai angka habis
        val sisa = tempAngka % 10 // membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
        arr.add(sisa)
        tempAngka /= 10
    }
    for (i in arr.indices) {
        print(arr[i])
    }
    println()
}

