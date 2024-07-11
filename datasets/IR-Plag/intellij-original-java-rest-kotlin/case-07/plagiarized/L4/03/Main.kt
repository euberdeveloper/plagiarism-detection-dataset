package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)

        print("Enter a 4 by 4 matrix row by row: ")
        val n = Array(4) { DoubleArray(4) }

        for (i in 0..3) {
            for (j in 0..3) {
                n[i][j] = input.nextDouble()
            }
        }

        var sum = 0.0

        for (i in n.indices) sum += n[i][i]

        print("Sum of the elements in the major diagonal is $sum")
    }
}
