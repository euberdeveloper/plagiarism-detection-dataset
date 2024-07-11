package IR

import java.util.*

object method {
    // method reverse
    fun beautyReverse(num: Int) {
        var n = num
        while (n != 0) {
            val r = n % 10
            print(r)
            n /= 10
        }
        println()
    }

    fun reverse(n: Int) {
        beautyReverse(n)
    }

    // main program
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val n = input.nextInt()
        // call method
        reverse(n)
    }
}

