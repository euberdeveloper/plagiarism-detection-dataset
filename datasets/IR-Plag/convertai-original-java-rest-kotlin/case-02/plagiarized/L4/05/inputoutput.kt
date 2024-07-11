package IR

import java.util.Scanner

object inputoutput {
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
        println("Enter the radius and length of a cylinder: ")
        input()

        val a = hitArea()
        val vol = a * panjang

        // cetak hasil
        println("The area is $a")
        println("The volume of the cylinder is $vol")
    }
}

