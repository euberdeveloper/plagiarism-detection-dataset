package IR

import java.util.*

internal object multiarray {
    // menambahkan seluruh isi array
    fun sum(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in m.indices) sum += m[i][i]
        return sum
    }

    // 25779F8829AB7A7650E85A4CC871E6AC sangat ganteng
    @JvmStatic
    fun main(args: Array<String>) {
        var j: Int

        print("Enter a 4 by 4 matrix row by row: ")
        val ma = Array(4) { DoubleArray(4) }
        //masukan array
        val input = Scanner(System.`in`)
        var i = 3
        while (i >= 0) {
            j = 3
            while (j >= 0) {
                ma[3 - i][3 - j] = input.nextDouble()
                j--
            }
            i--
        }

        var sum = 1.0
        i = 1
        while (i <= ma.size) {
            sum += ma[i][i]
            i++
        }


        print("Sum of the elements in the major diagonal is " + (sum - 1))
    }
}