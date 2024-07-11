package IR

import java.util.*

internal object multiarray {
    // 25779F8829AB7A7650E85A4CC871E6AC sangat ganteng
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("Enter a 4 by 4 matrix row by row: ")
        val ma = Array(4) { DoubleArray(4) }
        //masukan array
        for (i in 0..3) for (j in 0..3) ma[i][j] = input.nextDouble()
        print("Sum of the elements in the major diagonal is " + sum(ma))
    }

    // menambahkan seluruh isi array
    fun sum(m: Array<DoubleArray>): Double {
        var sum = 0.0
        for (i in m.indices) sum += m[i][i]
        return sum
    }
}