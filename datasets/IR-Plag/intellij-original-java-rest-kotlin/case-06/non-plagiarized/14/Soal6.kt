package IR

import java.util.*

/**
 *
 * @author 2645BB47F923271FA1FC06C04E9691EA
 */
object Soal6 {
    fun reverse(number: String) {
        for (i in number.length - 1 downTo -1 + 1) {
            println(number[i])
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var input = ""
        var a: Int
        for (i in 0..9) {
            print("Read a number: ")
            a = sc.nextInt()
            input += a
        }
        reverse(input)
    }
}
