package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer: ")
    val number = sc.nextInt()

    reverse(number)
}

fun reverse(number: Int) {
    var balik = ""
    var num = number
    while (num > 0) {
        balik += (num % 10).toString()
        num /= 10
    }
    println(balik)
}

