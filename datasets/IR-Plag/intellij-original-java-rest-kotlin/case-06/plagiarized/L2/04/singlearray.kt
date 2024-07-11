package IR

import java.util.*

internal object singlearray {
    @JvmStatic
    fun main(args: Array<String>) {
        val inp = Scanner(System.`in`)
        val n = IntArray(10)
        for (i in 0..9) {
            print("Read a number: ")
            n[i] = inp.nextInt()
        }
        for (a in 9 downTo 0) {
            println(n[a])
        }
    }
}