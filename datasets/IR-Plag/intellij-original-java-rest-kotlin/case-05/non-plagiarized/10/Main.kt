package IR

import java.util.*

object Main {
    fun reverse(number: Int) {
        val angka = number.toString() + ""
        for (i in angka.length - 1 downTo 0) {
            print(angka[i])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer: ")
        val number = sc.nextInt()
        reverse(number)
    }
}
