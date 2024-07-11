package IR

import java.util.*

object L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)

        print("Enter the radius and length of a cylinder: ")
        val jari2 = input.nextDouble()
        val panjang = input.nextDouble()
        val luas = jari2 * jari2 * 3.14159
        val total = luas * panjang
        println("The area is $luas")
        println("The volume of the cylinder is $total")
    }
}
