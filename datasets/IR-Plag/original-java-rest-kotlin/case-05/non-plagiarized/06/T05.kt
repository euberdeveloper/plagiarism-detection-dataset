package IR

import java.util.*

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
object T05 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer : ")
        val number = sc.nextInt()
        reverse(number)
    }

    fun reverse(number: Int) {
        val numberString = number.toString()
        for (i in numberString.length downTo 1) {
            print(numberString[i - 1])
        }
        println("")
    }
}
