package IR

import java.util.*

object L3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        var jari2 = 0.0
        var panjang = 0.0
        print("Enter the radius and length of a cylinder: ")
        jari2 = input.nextDouble()
        panjang = input.nextDouble()
        val luas = jari2 * jari2 * 3.14159
        val total = luas * panjang
        print("The area is $luas , ")
        println("The volume of the cylinder is $total")
    }
}
