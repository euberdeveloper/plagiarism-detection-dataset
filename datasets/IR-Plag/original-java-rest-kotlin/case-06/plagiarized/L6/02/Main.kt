package IR

import java.util.*

object Main {
    fun printNumber(number: IntArray) {
        for (i in 0..9) {
            println(number[i])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        val number = IntArray(10)
        var i = 9
        while (i >= 0) {
            // Input the number

            print("Read a number: ")
            number[i] = s.nextInt()
            i--
        }

        // Output the number
        printNumber(number)
    }
}
