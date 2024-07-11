package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arrNum = IntArray(10)
    for (i in 0 until 10) {
        print("Read a number: ")
        arrNum[i] = sc.nextInt()
    }
    for (i in 9 downTo 0) {
        println(arrNum[i])
    }
}

