package IR

import java.util.Scanner

fun beautyReverse(num: Int) {
    var tempNum = num
    while (tempNum != 0) {
        val r = tempNum % 10
        print(r)
        tempNum /= 10
    }
    println()
}

fun main(args: Array<String>) {
    print("Enter an integer: ")
    val input = Scanner(System.`in`)
    val n = input.nextInt()
    beautyReverse(n)
}

