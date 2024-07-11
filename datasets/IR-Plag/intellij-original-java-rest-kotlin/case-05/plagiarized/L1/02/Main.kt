package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //enter the number
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        val number = input.nextInt()
        //reverse number
        reverse(number)
    }

    fun reverse(number: Int) {
        var number = number
        while (number != 0) {
            val remainder = number % 10
            //output
            print(remainder)
            number = number / 10
        }
        println()
    }
}
