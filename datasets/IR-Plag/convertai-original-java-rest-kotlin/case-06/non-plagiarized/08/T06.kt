package IR

import java.util.Scanner

/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
fun main() {
    val sc = Scanner(System.`in`)
    val a = IntArray(10)
    for (i in 0 until 10) {
        print("Read a number")
        a[i] = sc.nextInt()
    }
    for (i in 0 until 10) {
        println(a[9 - i])
    }
}

