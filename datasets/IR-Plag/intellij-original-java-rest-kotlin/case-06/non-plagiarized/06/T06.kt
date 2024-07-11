package IR

import java.util.*

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
object T06 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val numbers = IntArray(10)
        for (i in 0..9) {
            print("Read a number : ")
            numbers[i] = sc.nextInt()
        }
        for (i in 9 downTo -1 + 1) {
            println(numbers[i])
        }
    }
}
