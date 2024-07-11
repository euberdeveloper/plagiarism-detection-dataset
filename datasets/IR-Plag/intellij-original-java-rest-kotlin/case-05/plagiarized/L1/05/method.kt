package IR

import java.util.*

internal object method {
    //prog utama
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val number = input.nextInt()
        //pamggil method
        reverse(number)
    }

    //method reverse
    fun reverse(number: Int) {
        var number = number
        while (number != 0) {
            val remainder = number % 10
            print(remainder)
            number = number / 10
        }
        println()
    }
}