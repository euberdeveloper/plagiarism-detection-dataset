package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val num = IntArray(10)


        for (i in 0..9) {
            // Input the number

            print("Read a number: ")
            num[i] = input.nextInt()
        }

        // Output the number
        for (i in 9 downTo 0) {
            println(num[i])
        }
    }
}
