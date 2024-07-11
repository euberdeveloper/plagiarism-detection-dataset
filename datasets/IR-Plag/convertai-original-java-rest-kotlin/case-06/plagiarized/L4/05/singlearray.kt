package IR

import java.util.Scanner

object singlearray {
    private val n = IntArray(10)

    @JvmStatic
    fun print() {
        for (a in 9 downTo 0) {
            println(n[a])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val inp = Scanner(System.`in`)

        for (i in 0 until 10) {
            print("Read a number: ")
            n[i] = inp.nextInt()
        }

        print()
    }
}

