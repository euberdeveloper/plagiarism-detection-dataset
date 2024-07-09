package IR

import java.util.*

object L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val num = IntArray(10)

        for (i in 0..9) {
            print("Read a number: ")
            num[i] = input.nextInt()
        }

        for (i in 9 downTo 0) {
            println(num[i])
        }
    }
}
