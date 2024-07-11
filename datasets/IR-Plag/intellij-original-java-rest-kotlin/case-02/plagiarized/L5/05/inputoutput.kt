package IR

import java.util.*

internal object inputoutput {
    var rad: Double = 0.0
    var panjang: Double = 0.0

    fun input() {
        val masukan = Scanner(System.`in`)
        rad = masukan.nextDouble()
        panjang = masukan.nextDouble()
    }

    fun hitArea(): Double {
        return rad * rad * 3.14159
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // masukan silinder

        print("Enter the radius and length of a cylinder: ")
        input()

        val vol: Double
        //perhitungan
        val a = hitArea()
        vol = a * panjang


        // cetak hasil
        println("The area is $a")
        println("The volume of the cylinder is $vol")
    }
}