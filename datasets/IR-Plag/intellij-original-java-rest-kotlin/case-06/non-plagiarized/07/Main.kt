package IR

import java.util.*

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
object Main {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val a = IntArray(10)

        for (i in 0..9) {
            print("Read a number: ")
            val number = sc.nextInt()
            a[i] = number
        }

        for (i in 9 downTo 0) {
            println(a[i])
        }
    }
}
