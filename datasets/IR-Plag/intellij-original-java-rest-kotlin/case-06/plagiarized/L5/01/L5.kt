package IR

import java.util.*

object L5 {
    fun print(arr: IntArray) {
        var i = 9
        while (i >= 0) {
            println(arr[i])
            i--
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val angka = IntArray(10)
        val sc = Scanner(System.`in`)
        var i = 0
        while (i != 10) {
            print("Read a number: ")
            angka[i] = sc.nextInt()
            i++
        }

        print(angka)
    }
}
