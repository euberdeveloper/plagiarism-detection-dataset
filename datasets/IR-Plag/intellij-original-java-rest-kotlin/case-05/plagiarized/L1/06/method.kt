package IR

import java.util.*

object method {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")

        val input = Scanner(System.`in`)
        val number = input.nextInt() //input integer
        reverse(number) //memanggil fungsi reverse
    }

    fun reverse(number: Int) {
        var number = number
        while (number != 0) { //looping sampai angka habis
            val remainder = number % 10 //membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
            print(remainder)
            number = number / 10
        }

        println()
    }
}
