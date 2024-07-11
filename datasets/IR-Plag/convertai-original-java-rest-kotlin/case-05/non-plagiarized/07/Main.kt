package IR

import java.util.Scanner

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    print("Enter an integer: ")
    val number = sc.nextInt()

    reverse(number)
}

fun reverse(number: Int) {
    var tempDigit = 0
    var num = number

    while (num > 0) {
        tempDigit = num % 10
        print(tempDigit)
        num /= 10
    }
}

