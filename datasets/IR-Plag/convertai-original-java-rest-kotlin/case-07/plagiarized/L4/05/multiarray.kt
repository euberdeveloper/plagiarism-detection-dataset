package IR

import java.util.*

class multiarray {
    companion object {
        // menambahkan seluruh isi array
        fun sum(m: Array<DoubleArray>): Double {
            var sum = 0.0
            for (i in m.indices) {
                sum += m[i][i]
            }
            return sum
        }

        // 25779F8829AB7A7650E85A4CC871E6AC sangat ganteng
        @JvmStatic
        fun main(args: Array<String>) {
            println("Enter a 4 by 4 matrix row by row: ")
            val ma = Array(4) { DoubleArray(4) }
            // masukan array
            val input = Scanner(System.`in`)
            for (i in 0 until 4) {
                for (j in 0 until 4) {
                    ma[i][j] = input.nextDouble()
                }
            }

            val sum = sum(ma)
            println("Sum of the elements in the major diagonal is $sum")
        }
    }
}

