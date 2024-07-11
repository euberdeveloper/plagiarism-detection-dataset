package IR

import java.util.Scanner

/**
 *
 * @author 2645BB47F923271FA1FC06C04E9691EA
 */
fun reverse(number: String) {
    for (i in number.length - 1 downTo 0) {
        println(number[i])
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    var input = ""
    for (i in 0 until 10) {
        print("Read a number: ")
        val a = sc.nextInt()
        input += a
    }
    reverse(input)
}

