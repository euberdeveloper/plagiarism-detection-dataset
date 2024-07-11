package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
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
