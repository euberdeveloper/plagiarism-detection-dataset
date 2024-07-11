package IR

import java.util.Scanner

/**
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
fun main() {
    val s = Scanner(System.`in`)
    print("Enter an integer ")
    val a = s.nextInt()
    reverse(a)
}

fun reverse(number: Int) {
    val cek = number.toString()
    for (i in cek.length - 1 downTo 0) {
        print(cek[i])
    }
    println("")
}

