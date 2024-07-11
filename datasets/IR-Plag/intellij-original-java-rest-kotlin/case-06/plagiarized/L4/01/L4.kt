package IR

import java.util.*

object L4 {
    fun print(arr: IntArray) {
        for (i in 9 downTo 0) {
            println(arr[i])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val angka = IntArray(10)
        val sc = Scanner(System.`in`)

        for (i in 0..9) {
            print("Read a number: ")
            angka[i] = sc.nextInt()
        }

        print(angka)
    }
}
