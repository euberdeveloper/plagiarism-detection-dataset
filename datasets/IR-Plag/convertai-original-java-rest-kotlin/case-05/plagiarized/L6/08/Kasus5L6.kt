package IR

import java.util.Scanner

fun main(args: Array<String>) {
    // input data
    val inp = Scanner(System.`in`)
    print("Enter an integer: ")
    val angka = inp.next()
    for (i in angka.length - 1 downTo 0) {
        print(angka[i])
    }
    println()
}

