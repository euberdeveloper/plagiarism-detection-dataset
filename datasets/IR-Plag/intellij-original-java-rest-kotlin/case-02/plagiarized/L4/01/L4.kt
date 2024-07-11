package IR

import java.util.*

object L4 {
    fun hitLuas(jari2: Double): Double {
        return jari2 * jari2 * 3.14159
    }

    fun total(luas: Double, panjang: Double): Double {
        return luas * panjang
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        var jari2 = 0.0
        var panjang = 0.0
        print("Enter the radius and length of a cylinder: ")
        jari2 = input.nextDouble()
        panjang = input.nextDouble()
        val luas = hitLuas(jari2)
        val total = total(luas, panjang)

        print("The area is $luas , ")
        println("The volume of the cylinder is $total")
    }
}
