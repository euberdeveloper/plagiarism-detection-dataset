package IR

import java.util.Scanner

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
fun reverse(number: Int) {
    val a = number.toString()
    for (i in a.length - 1 downTo 0) {
        print(a[i])
    }
    println()
}

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer: ")
    val number = sc.nextInt()
    reverse(number)
}

