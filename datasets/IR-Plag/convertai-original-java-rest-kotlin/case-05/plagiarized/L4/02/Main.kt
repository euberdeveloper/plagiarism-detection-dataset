package IR

import java.util.Scanner

fun main(args: Array<String>) {
    val nmb = input()
    reverse(nmb)
}

fun input(): Int {
    print("Enter an integer: ")
    return Scanner(System.`in`).nextInt()
}

fun reverse(nmb: Int) {
    var get = 0
    var num = nmb
    while (num != 0) {
        get = num % 10
        print(get)
        num /= 10
    }
    println()
}

