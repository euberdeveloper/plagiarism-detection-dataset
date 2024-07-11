package IR

import java.util.Scanner

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    print("Enter an integer: ")
    val inp = sc.nextInt()
    reverse(inp)
}

fun reverse(number: Int) {
    var a = 0
    var i = number.toDouble().log10().toInt()
    while (number != 0) {
        val b = number % 10
        a += b * Math.pow(10.0, i--.toDouble()).toInt()
        number /= 10
    }
    println(a)
}

