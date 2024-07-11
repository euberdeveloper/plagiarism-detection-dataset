package IR

import java.util.*

object L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")

        val input = Scanner(System.`in`)

        val number = input.nextInt()

        reverse(number)
    }

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
