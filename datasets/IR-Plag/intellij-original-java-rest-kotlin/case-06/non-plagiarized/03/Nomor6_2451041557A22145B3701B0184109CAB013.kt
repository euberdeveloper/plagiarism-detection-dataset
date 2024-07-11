package IR

import java.util.*

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
object Nomor6_2451041557A22145B3701B0184109CAB013 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val Array = IntArray(10)
        for (i in 0..9) {
            print("Read a number: ")
            Array[i] = sc.nextInt()
        }
        for (i in 9 downTo 0) {
            println(Array[i])
        }
    }
}
