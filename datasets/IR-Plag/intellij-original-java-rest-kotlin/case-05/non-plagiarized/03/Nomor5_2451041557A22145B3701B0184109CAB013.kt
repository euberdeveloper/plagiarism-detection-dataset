package IR

import java.util.*

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
object Nomor5_2451041557A22145B3701B0184109CAB013 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer : ")
        val number = sc.nextInt()
        reverse(number)
    }

    fun reverse(number: Int) {
        val strNumber = number.toString()
        var temp = ""
        for (i in strNumber.length downTo 1) {
            temp += i
        }
        val tempNumber = temp.toInt()
        println((tempNumber))
    }
}
