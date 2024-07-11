package IR

import java.util.Scanner

/**
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
fun main() {
    val sc = Scanner(System.`in`)

    val input = IntArray(10)

    for (i in input.indices) {
        print("Read a number: ")
        input[i] = sc.nextInt()
    }

    for (i in input.size - 1 downTo 0) {
        println(input[i])
    }
}

