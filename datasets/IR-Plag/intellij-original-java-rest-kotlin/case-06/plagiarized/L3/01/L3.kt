package IR

import java.util.*

object L3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val angka = IntArray(10)
        val sc = Scanner(System.`in`)

        for (i in 0..9) {
            print("Read a number: ")
            angka[i] = sc.nextInt()
        }

        for (i in 9 downTo 0) {
            println(angka[i])
        }
    }
}
