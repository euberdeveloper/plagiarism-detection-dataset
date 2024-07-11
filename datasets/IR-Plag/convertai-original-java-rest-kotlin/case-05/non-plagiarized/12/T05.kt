package IR

import java.util.Scanner

/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
object T05 {
    private var a: Int = 0

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer:")
        val a = sc.nextInt()
        reverse(a)
    }

    @JvmStatic
    private fun reverse(number: Int) {
        var reverse = 0
        var num = number
        while (num != 0) {
            reverse = reverse * 10
            reverse += num % 10
            num /= 10
        }
        println(reverse)
    }
}

