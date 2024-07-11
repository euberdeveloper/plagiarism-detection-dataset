package IR

import java.util.*

object TestSatuArray {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val arr = IntArray(10) //inisialisasi array
        for (x in 0..9) { //looping untuk input array
            print("Read a number: ")
            arr[x] = sc.nextInt() //input ke array
        }
        for (x in 9 downTo 0) { //looping untuk menampilkan array
            println(arr[x]) //menampilkan array
        }
    }
}
