package IR

import java.util.*

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
object Soal5 {
    fun reverse(number: Int) {
        val a = number.toString()

        for (i in a.length - 1 downTo -1 + 1) {
            print(a[i])
        }
        println("")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer: ")
        val number = sc.nextInt()
        reverse(number)
    }
}
