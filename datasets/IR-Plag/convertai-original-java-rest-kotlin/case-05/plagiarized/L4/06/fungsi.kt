package IR

import java.util.Scanner

fun main() {
    println("Enter an integer: ")
    val sc = Scanner(System.`in`)
    var input = sc.nextInt()
    while (input != 0) {
        val sisa = input % 10
        print(sisa)
        input /= 10
    }
}

