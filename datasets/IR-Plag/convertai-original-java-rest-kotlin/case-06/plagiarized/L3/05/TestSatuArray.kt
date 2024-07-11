package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(10) // initialize array
    for (x in 0 until 10) { // loop for input array
        print("Read a number: ")
        arr[x] = sc.nextInt() // input to array
    }
    for (x in 9 downTo 0) { // loop for displaying array
        println(arr[x]) // display array
    }
}

