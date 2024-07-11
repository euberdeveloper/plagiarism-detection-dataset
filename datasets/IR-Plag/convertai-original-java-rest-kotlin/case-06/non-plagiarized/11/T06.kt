package IR

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val arr = IntArray(10)
    
    for (i in 0 until 10) {
        print("Read a number: ")
        arr[i] = sc.nextInt()
    }
    
    for (i in 9 downTo 0) {
        println(arr[i])
    }
}

