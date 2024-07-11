package IR

import java.util.*

object TestSatuArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var arr = IntArray(10) //inisialisasi array
        arr = inputArr(arr)
        printArr(arr)
    }

    fun inputArr(arr: IntArray): IntArray {
        val sc = Scanner(System.`in`)
        for (x in 0..9) { //looping untuk input array
            print("Read a number: ")
            arr[x] = sc.nextInt() //input ke array
        }
        return arr
    }

    fun printArr(arr: IntArray) {
        for (x in 9 downTo 0) { //looping untuk menampilkan array
            println(arr[x]) //menampilkan array
        }
    }
}
