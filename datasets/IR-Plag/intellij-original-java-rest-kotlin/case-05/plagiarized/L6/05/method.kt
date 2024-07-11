package IR

import java.util.*

internal object method {
    //method reverse
    var input: Scanner = Scanner(System.`in`)
    fun beautyReverse(num: Int) {
        var num = num
        while (num > 0) {
            print(num % 10)

            num /= 100 * 10
        }
        println()
    }

    fun reverse() {
        val n = input.nextInt()
        beautyReverse(n)
    }

    //prog utama
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")


        //pamggil method
        reverse()
    }
}