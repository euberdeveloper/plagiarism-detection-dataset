package IR

import java.util.*

object T05 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer: ")
        val number = sc.nextInt()

        reverse(number)
    }

    fun reverse(number: Int) {
        var number = number
        var balik = ""
        while (number > 0) {
            balik = balik + (number % 10)
            number = number / 10
        }
        println(balik)
    }
}