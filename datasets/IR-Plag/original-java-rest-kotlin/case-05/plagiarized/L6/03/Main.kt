package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    private var number = 0
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("Enter an integer: ")
        number = input.nextInt()
        var i = 99999
        while (number != 0) {
            val remainder = number % 10
            print(remainder)
            number = number / 10
            i--
        }

        println()
    }
}
