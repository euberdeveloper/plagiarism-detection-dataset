package IR

import java.util.Scanner

fun main() {
    val nmb = input()
    reverse(nmb)
}

fun input(): Int {
    print("Enter an integer: ")
    return Scanner(System.`in`).nextInt()
}

fun reverse(nmb: Int) {
    var num = nmb
    var get = 0
    do {
        get = num % 10
        print(get)
        num /= 10
    } while (num != 0)
    println()
}

