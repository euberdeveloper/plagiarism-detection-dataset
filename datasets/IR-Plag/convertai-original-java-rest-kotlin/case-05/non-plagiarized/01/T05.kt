package IR

import java.util.Scanner

/**
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
fun main() {
    val sc = Scanner(System.`in`)

    print("Enter an integer: ")
    val number = sc.nextInt()

    reverse(number)
}

fun reverse(number: Int) {
    var num = number
    while (num > 0) {
        print(num % 10)
        num /= 10
    }
    println()
}

