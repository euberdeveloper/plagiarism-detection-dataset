package IR

import java.util.Scanner

fun main() {
    print("Enter an integer: ")
    val input = Scanner(System.`in`)
    val number = input.nextInt()
    reverse(number)
}

fun reverse(number: Int) {
    var num = number
    while (num != 0) {
        val remainder = num % 10
        print(remainder)
        num /= 10
    }
    println()
}

