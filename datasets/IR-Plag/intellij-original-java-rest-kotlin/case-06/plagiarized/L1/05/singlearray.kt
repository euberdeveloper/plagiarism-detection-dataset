package IR

import java.util.*

object singlearray {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val num = IntArray(10) //inisialisasi array
        for (i in 0..9) { //looping untuk input array
            print("Read a number: ")
            num[i] = input.nextInt() //input ke array
        }
        for (i in 9 downTo 0) { //looping untuk menampilkan array
            println(num[i]) //menampilkan array
        }
    }
}
