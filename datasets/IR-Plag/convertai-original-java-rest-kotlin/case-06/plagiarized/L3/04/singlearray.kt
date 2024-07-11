package IR

import java.util.Scanner

fun main() {
    val n = IntArray(10)
    val inp = Scanner(System.`in`)

    for (i in 0 until 10) {
        println("Read a number: ")
        n[i] = inp.nextInt()
    }

    for (a in 9 downTo 0) {
        println(n[a])
    }
}

