package IR

import java.util.*

object inout {
    @JvmStatic
    fun main(args: Array<String>) {
        val rad: Double
        val l: Double
        val sc = Scanner(System.`in`)
        // Enter radius of the cylinder
        print("Enter the radius and length of a cylinder : ") //untuk print
        rad = sc.nextDouble() //menginput radius
        l = sc.nextDouble() //menginput length
        hitungVol(hitungAr(rad), l)
    }

    fun hitungVol(ar: Double, l: Double) {
        val vol = ar * l
        println("The volume of the cylinder is $vol") //mengeluarkan hasil
    }

    fun hitungAr(rad: Double): Double {
        val ar = rad * rad * 3.14159
        println("The area is $ar") //mengeluarkan hasil
        return ar
    }
}