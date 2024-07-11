package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val num = IntArray(10)
    for (i in 0 until 10) {
        print("Read a number: ")
        num[i] = input.nextInt()
    }
    for (i in 9 downTo 0) {
        println(num[i])
    }
}

