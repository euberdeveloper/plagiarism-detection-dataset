package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val sc = Scanner(System.`in`) // panggil dari package
    val arrAngka = IntArray(10)

    for (x in 0 until 10) {
        print("Read a number: ")
        arrAngka[x] = sc.nextInt()
    }

    for (x in 9 downTo 0)
        println(arrAngka[x])
}

