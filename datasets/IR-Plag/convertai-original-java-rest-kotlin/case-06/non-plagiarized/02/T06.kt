package IR

import java.util.Scanner

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
fun main() {
    val s = Scanner(System.`in`)
    val a = IntArray(10)
    for (i in 0 until 10) {
        print("Read a number: ")
        a[i] = s.nextInt()
    }
    for (i in 9 downTo 0) {
        println(a[i])
    }
}

