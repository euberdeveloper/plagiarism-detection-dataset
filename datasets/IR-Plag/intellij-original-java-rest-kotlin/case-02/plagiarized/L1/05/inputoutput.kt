package IR

import java.util.*

object inputoutput {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)


        // masukan silinder
        print("Enter the radius and length of a cylinder: ")
        val radius = input.nextDouble()
        val length = input.nextDouble()


        //perhitungan
        val area = radius * radius * 3.14159
        val volume = area * length


        // cetak hasil
        println("The area is $area")
        println("The volume of the cylinder is $volume")
    }
}