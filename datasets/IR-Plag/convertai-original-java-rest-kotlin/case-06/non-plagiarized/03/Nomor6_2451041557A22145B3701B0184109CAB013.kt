package IR

import java.util.Scanner

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
fun main() {
    val sc = Scanner(System.`in`)
    val Array = IntArray(10)
    for (i in 0 until 10) {
        print("Read a number: ")
        Array[i] = sc.nextInt()
    }
    for (i in 9 downTo 0) {
        println(Array[i])
    }
}

