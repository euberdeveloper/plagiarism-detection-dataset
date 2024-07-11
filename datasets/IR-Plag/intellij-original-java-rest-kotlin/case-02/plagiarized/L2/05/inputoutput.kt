package IR

import java.util.*

internal object inputoutput {
    @JvmStatic
    fun main(args: Array<String>) {
        val masukan = Scanner(System.`in`)


        // masukan silinder
        print("Enter the radius and length of a cylinder: ")
        val rad = masukan.nextDouble()
        val panjang = masukan.nextDouble()


        //perhitungan
        val a = rad * rad * 3.14159
        val vol = a * panjang


        // cetak hasil
        println("The area is $a")
        println("The volume of the cylinder is $vol")
    }
}