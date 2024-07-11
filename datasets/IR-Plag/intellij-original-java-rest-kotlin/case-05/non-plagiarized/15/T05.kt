package IR

import java.util.*
import kotlin.math.log10

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
object T05 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer: ")
        val inp = sc.nextInt()
        reverse(inp)
    }

    fun reverse(number: Int) {
        var number = number
        var a = 0
        var i = log10(number.toDouble()).toInt()
        while (number != 0) {
            val b = number % 10
            a = (a + b * 10.pow(i--.toDouble())).toInt()
            number /= 10
        }
        println(a)
    }
}
