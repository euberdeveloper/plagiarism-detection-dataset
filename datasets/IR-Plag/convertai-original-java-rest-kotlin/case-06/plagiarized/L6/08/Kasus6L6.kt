package IR

import java.util.Scanner

fun main() {
    // Deklarasi
    val arrNum = IntArray(10)
    val inp = Scanner(System.`in`)
    // for untuk 10 kali input
    var i = 9
    while (i >= 0) {
        // Read a number
        print("Read a number: ")
        arrNum[i] = inp.nextInt()
        i--
    }

    // Display the array
    reverse(arrNum)
}

private fun reverse(arr: IntArray) {
    var i = 0
    while (i < 10) {
        // Print angka dalam array
        println(arr[i])
        i++
    }
}

