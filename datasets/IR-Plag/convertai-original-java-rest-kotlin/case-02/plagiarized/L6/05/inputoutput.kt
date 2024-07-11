package IR

import java.util.Scanner

object inputoutput {
    private var rad: Double = 0.0
    private var panjang: Double = 0.0
    private val masukan = Scanner(System.`in`)

    fun input() {
        rad = masukan.nextDouble()
        panjang = masukan.nextDouble()
    }

    fun hitArea(): Double {
        return Math.pow(rad, 2.0) * 3.14159
    }

    @JvmStatic
    fun main(args: Array<String>) {
        // masukan silinder
        println("Enter the radius and length of a cylinder: ")
        input()

        val vol: Double
        val a: Double
        //perhitungan
        a = hitArea()
        vol = a * panjang

        // cetak hasil
        println("The area is $a")
        println("The volume of the cylinder is $vol")
    }
}

