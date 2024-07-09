package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val number = IntArray(10)
        val s = Scanner(System.`in`)



        for (i in 0..9) {
            // Input the number

            print("Read a number: ")
            number[i] = s.nextInt()
        }

        // Output the number
        for (i in 9 downTo 0) {
            println(number[i])
        }
    }
}
