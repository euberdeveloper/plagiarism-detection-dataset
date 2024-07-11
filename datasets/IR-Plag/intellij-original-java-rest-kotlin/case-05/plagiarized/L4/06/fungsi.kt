package IR

import java.util.*

object fungsi {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")

        val sc = Scanner(System.`in`)
        var input: Int
        input = sc.nextInt() //input integer
        while (input != 0) {
            //looping sampai angka habis
            var sisa = input % 10 //membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
            print(sisa)
            input = input / 10
        }
    }
}
