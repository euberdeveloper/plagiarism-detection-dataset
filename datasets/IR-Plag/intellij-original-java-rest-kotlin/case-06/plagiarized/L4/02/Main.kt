package IR

import java.util.*

object Main {
    fun printNumber(number: IntArray) {
        for (i in 9 downTo 0) {
            println(number[i])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        val number = IntArray(10)


        for (i in 0..9) {
            // Input the number

            print("Read a number: ")
            number[i] = s.nextInt()
        }

        // Output the number
        printNumber(number)
    }
}
