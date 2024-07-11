package IR

import java.util.Scanner

object method {
    // method reverse
    private val input = Scanner(System.`in`)

    fun beautyReverse(num: Int) {
        var n = num
        while (n > 0) {
            print(n % 10)
            n /= 100 * 10
        }
        println()
    }

    fun reverse() {
        val n = input.nextInt()
        beautyReverse(n)
    }

    // prog utama
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        // pamggil method
        reverse()
    }
}

