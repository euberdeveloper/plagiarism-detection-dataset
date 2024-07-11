package IR

import java.util.*

internal object method {
    //prog utama
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val n = input.nextInt()
        //pamggil method
        beautyReverse(n)
    }

    //method reverse
    fun beautyReverse(num: Int) {
        var num = num
        while (num != 0) {
            val r = num % 10
            print(r)
            num = num / 10
        }
        println()
    }
}