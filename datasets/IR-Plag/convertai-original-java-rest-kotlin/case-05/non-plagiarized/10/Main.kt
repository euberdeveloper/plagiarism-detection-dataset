package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer: ")
    val number = sc.nextInt()
    reverse(number)
}

fun reverse(number: Int) {
    val angka = number.toString()
    for (i in angka.length - 1 downTo 0) {
        print(angka[i])
    }
}

