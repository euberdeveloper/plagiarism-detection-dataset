package IR

import java.util.Scanner

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
fun main() {
    // TODO code application logic here
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

