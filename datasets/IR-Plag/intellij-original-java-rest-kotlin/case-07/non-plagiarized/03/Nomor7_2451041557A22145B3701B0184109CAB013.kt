package IR

import java.util.*

/**
 *
 * @author ASUS
 */
object Nomor7_2451041557A22145B3701B0184109CAB013 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val matrix = Array(4) { IntArray(4) }
        var sum = 0
        println("Enter a 4-by-4 matrix row by row: ")
        for (i in 0..3) {
            for (j in 0..3) {
                matrix[i][j] = sc.nextInt()
                if (i == j) {
                    sum += matrix[i][j]
                }
            }
        }
        println("Sum of the elements in the major diagonal is $sum")
    }
}
