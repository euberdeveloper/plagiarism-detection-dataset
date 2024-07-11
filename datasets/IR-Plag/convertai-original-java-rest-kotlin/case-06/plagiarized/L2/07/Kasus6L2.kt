package IR

import java.util.Scanner

fun main(args: Array<String>) {
    // Deklarasi
    val inp = Scanner(System.`in`)
    val arrNum = IntArray(10)
    // for untuk 10 kali input
    for (i in 0 until 10) {
        // Read a number
        print("Read a number: ")
        arrNum[i] = inp.nextInt()
    }
    // Display the array
    for (i in 9 downTo 0) {
        // Print angka dalam array
        println(arrNum[i])
    }
}

