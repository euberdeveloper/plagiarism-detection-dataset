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
        val arr: MutableList<*> = ArrayList<Any?>()
        run {
            var i = 0
            while (i <= angka) {
                //looping sampai angka habis
                var sisa = angka % 10 //membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
                arr.add(sisa)
                angka = angka / 10
                i = 0
                i++
            }
        }
        for (i in arr.indices) {
            print(arr[i])
        }

        println()
    }
}
