package IR

import java.util.Scanner

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
fun main(args: Array<String>) {
    val arr = IntArray(10)
    val sc = Scanner(System.`in`)
    for (i in 0 until 10) {
        print("Read a number: ")
        arr[i] = sc.nextInt()
    }
    for (i in 9 downTo 0) {
        println(arr[i])
    }
}

