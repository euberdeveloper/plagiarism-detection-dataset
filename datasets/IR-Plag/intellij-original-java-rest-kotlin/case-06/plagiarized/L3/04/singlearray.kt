package IR

import java.util.*

internal object singlearray {
    var n: IntArray = IntArray(10)
    @JvmStatic
    fun main(args: Array<String>) {
        val inp = Scanner(System.`in`)

        for (i in 0..9) {
            print("Read a number: ")
            n[i] = inp.nextInt()
        }
        for (a in 9 downTo 0) {
            println(n[a])
        }
    }
}