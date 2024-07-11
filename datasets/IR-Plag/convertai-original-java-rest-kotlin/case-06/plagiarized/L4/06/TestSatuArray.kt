package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(10) // initialize array
    inputArr(arr)
    printArr(arr)
}

fun inputArr(arr: IntArray) {
    val sc = Scanner(System.`in`)
    for (x in arr.indices) { // loop for input array
        print("Read a number: ")
        arr[x] = sc.nextInt() // input to array
    }
}

fun printArr(arr: IntArray) {
    for (x in arr.size - 1 downTo 0) { // loop for displaying array
        println(arr[x]) // display array
    }
}

