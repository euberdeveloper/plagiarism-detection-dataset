package IR

import java.util.*

object TestSatuArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val arr = IntArray(10) //inisialisasi array

        printArr(inputArr(arr))
    }

    fun inputArr(arr: IntArray): IntArray {
        val sc = Scanner(System.`in`)
        var x = 0
        val arr2 = IntArray(10)
        while (x < 10) { //looping untuk input array
            print("Read a number: ")
            arr[x] = sc.nextInt() //input ke array
            x++
        }
        x = 9
        for (i in 0..9) {
            arr2[i] = arr[x]
            x--
        }
        return arr2
    }

    fun printArr(arr: IntArray) {
        var x = 0
        while (x < 10) { //looping untuk menampilkan array
            println(arr[x]) //menampilkan array
            x++
        }
    }
}
