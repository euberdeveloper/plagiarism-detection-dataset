package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer: ")
    val num = sc.nextInt()
    reverse(num)
}

fun reverse(number: Int) {
    val tmpNumber = number.toString()
    for (i in tmpNumber.length - 1 downTo 0) {
        print(tmpNumber[i])
    }
    println()
}

