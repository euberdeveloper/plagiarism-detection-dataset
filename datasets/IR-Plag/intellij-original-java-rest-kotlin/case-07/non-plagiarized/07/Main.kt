package IR

import java.text.DecimalFormat
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
        val a = Array(4) { DoubleArray(4) }
        for (i in 0..3) {
            for (j in 0..3) {
                a[i][j] = sc.nextDouble()
            }
        }


        for (i in 0..3) {
            for (j in 0..3) {
                if (a[i][j] % 1 == 0.0) {
                    val decimalFormat = DecimalFormat("#")
                    val numberAsString = decimalFormat.format(a[i][j])
                    print(numberAsString)
                } else {
                    print(a[i][j])
                }
                print(" ")
            }
            println("")
        }



        println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(a))
    }

    fun sumMajorDiagonal(array: Array<DoubleArray>): Double {
        var total = 0.0

        for (index in array.indices) {
            total += array[index][index]
        }

        return total
    }
}
