package IR

import java.util.*

object fungsi {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")

        val sc = Scanner(System.`in`)
        val input = sc.nextInt() //input integer
        terbalik(input) //memanggil fungsi reverse
    }

    fun terbalik(angka: Int) {
        var angka = angka
        while (angka != 0) { //looping sampai angka habis
            val sisa = angka % 10 //membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
            print(sisa)
            angka = angka / 10
        }

        println()
    }
}
