package IR

import java.util.*

object L5 {
    fun hitLuas(jari2: Double): Double {
        return jari2 * jari2 * 3.14159
    }

    fun total(luas: Double, panjang: Double): Double {
        return luas * panjang
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val luas: Double
        val total: Double
        print("Enter the radius and length of a cylinder: ")
        val jari2 = input.nextDouble()
        val panjang = input.nextDouble()
        luas = hitLuas(jari2)
        total = total(luas, panjang)

        print("The area is $luas , ")
        println("The volume of the cylinder is $total")
    }
}
