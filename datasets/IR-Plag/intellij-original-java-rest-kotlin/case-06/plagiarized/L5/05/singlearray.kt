package IR

import java.util.*

internal object singlearray {
    var n: IntArray = IntArray(10)
    fun print() {
        for (a in 9 downTo 0) {
            println(n[a])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val inp = Scanner(System.`in`)

        var i = 0
        while (i < 10) {
            print("Read a number: ")
            n[i] = inp.nextInt()
            i++
        }
        print()
    }
}