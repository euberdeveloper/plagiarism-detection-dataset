package IR

import java.util.Scanner

fun main() {
    val angka = IntArray(10)
    val sc = Scanner(System.`in`)

    for (i in angka.indices) {
        print("Read a number: ")
        angka[i] = sc.nextInt()
    }

    for (i in angka.size - 1 downTo 0) {
        println(angka[i])
    }
}

