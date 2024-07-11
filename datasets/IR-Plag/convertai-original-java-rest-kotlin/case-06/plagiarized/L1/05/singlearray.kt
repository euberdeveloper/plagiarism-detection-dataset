package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val num = IntArray(10) // initialize array
    for (i in 0 until 10) { // loop for input array
        print("Read a number: ")
        num[i] = input.nextInt() // input to array
    }
    for (i in 9 downTo 0) { // loop for displaying array
        println(num[i]) // display array
    }
}

