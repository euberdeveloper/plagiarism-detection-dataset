package IR

import java.util.Scanner

fun main(args: Array<String>) {
    // Deklarasi
    val arrNum = IntArray(10)
    val inp = Scanner(System.`in`)
    // for untuk 10 kali input
    for (i in 0 until 10) {
        // Read a number
        print("Read a number: ")
        arrNum[i] = inp.nextInt()
    }
    // Display the array
    reverse(arrNum)
}

private fun reverse(arr: IntArray) {
    for (i in arr.size - 1 downTo 0) {
        // Print angka dalam array
        println(arr[i])
    }
}

