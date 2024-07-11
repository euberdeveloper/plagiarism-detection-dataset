package IR

import java.util.*

internal object singlearray {
    var n: IntArray = IntArray(10)

    @JvmStatic
    fun main(args: Array<String>) {
        val inp = Scanner(System.`in`)

        var i = 9
        var a = 0
        while (i >= 0) {
            print("Read a number: ")
            n[a] = inp.nextInt()
            a++
            i--
        }
        print()
    }

    fun print() {
        for (a in 0..9) {
            println(n[9 - a])
        }
    }
}