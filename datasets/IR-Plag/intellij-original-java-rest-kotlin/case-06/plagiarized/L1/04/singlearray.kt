package IR

import java.util.*

internal object singlearray {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val num = IntArray(10)
        for (i in 0..9) {
            print(
                "Read a number: "
            )
            num[i] = input.nextInt()
        }
        for (i in 9 downTo 0) {
            println(num[i])
        }
    }
}