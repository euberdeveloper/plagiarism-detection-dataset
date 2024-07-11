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
    var x = 1
    val rev = nmb.toString()
    do {
        print(rev[rev.length - x])
        x++
    } while (nmb / 10 != 0)
    println()
}

