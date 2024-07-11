package IR

import java.util.Scanner

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = IntArray(10)
    
    for (i in 0 until 10) {
        print("Read a number: ")
        val number = sc.nextInt()
        a[i] = number
    }
    
    for (i in 9 downTo 0) {
        println(a[i])
    }
}

