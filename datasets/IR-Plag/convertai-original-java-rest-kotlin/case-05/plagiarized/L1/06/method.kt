package IR

import java.util.Scanner

fun main() {
    println("Enter an integer: ")
    val input = Scanner(System.`in`)
    val number = input.nextInt() // input integer
    reverse(number) // calling reverse function
}

fun reverse(number: Int) {
    var num = number
    while (num != 0) { // looping until number is exhausted
        val remainder = num % 10 // dividing the number by 10 until no more remainder
        print(remainder)
        num /= 10
    }
    println()
}

