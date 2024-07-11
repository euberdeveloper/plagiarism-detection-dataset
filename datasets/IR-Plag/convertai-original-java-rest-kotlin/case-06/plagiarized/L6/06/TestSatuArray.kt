package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(10) // initialize array

    printArr(inputArr(arr))
}

fun inputArr(arr: IntArray): IntArray {
    val sc = Scanner(System.`in`)
    var x = 0
    val arr2 = IntArray(10)
    while (x < 10) { // loop for input array
        print("Read a number: ")
        arr[x] = sc.nextInt() // input to array
        x++
    }
    x = 9
    for (i in 0 until 10) {
        arr2[i] = arr[x]
        x--
    }
    return arr2
}

fun printArr(arr: IntArray) {
    var x = 0
    while (x < 10) { // loop for displaying array
        println(arr[x]) // display array
        x++
    }
}

