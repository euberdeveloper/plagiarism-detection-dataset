package IR

import java.util.*

object T6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val num = IntArray(10)

        for (i in 0..9) {
            // Read a number
            print("Read a number: ")

            num[i] = input.nextInt()
        }

        // Display the array
        for (i in 9 downTo 0) {
            println(num[i])
        }
    }
}
