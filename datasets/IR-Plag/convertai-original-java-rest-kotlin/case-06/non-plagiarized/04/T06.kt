package IR

import java.util.Scanner

/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
fun main() {
    val s = Scanner(System.`in`)
    val a = IntArray(10)
    for (i in a.indices) {
        print("Read a number: ")
        a[i] = s.nextInt()
    }
    for (i in a.size - 1 downTo 0) {
        println(a[i])
    }
}

