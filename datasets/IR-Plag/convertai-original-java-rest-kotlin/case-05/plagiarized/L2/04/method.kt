package IR

import java.util.Scanner

fun main() {
    print("Enter an integer: ")
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    beautyReverse(n)
}

fun beautyReverse(num: Int) {
    var tempNum = num
    while (tempNum != 0) {
        val r = tempNum % 10
        print(r)
        tempNum /= 10
    }
    println()
}

