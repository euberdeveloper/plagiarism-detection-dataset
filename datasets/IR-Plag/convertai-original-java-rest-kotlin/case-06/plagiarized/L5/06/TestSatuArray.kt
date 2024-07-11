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
    var x = 0
    while (x < 10) { // loop for input array
        println("Read a number: ")
        arr[x] = sc.nextInt() // input to array
        x++
    }
}

fun printArr(arr: IntArray) {
    var x = 9
    while (x >= 0) { // loop for displaying array
        println(arr[x]) // display array
        x--
    }
}

