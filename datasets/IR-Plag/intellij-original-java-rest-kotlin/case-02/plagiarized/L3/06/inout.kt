package IR

import java.util.*

object inout {
    @JvmStatic
    fun main(args: Array<String>) {
        val rad: Double
        val l: Double
        val vol: Double
        val sc = Scanner(System.`in`)
        // Enter radius of the cylinder
        print("Enter the radius and length of a cylinder : ") //untuk print
        rad = sc.nextDouble() //menginput radius
        l = sc.nextDouble() //menginput length
        val ar = rad * rad * 3.14159 //mencari area
        vol = ar * l //mencari voulume
        println("The area is $ar") //mengeluarkan hasil
        println("The volume of the cylinder is $vol") //mengeluarkan hasil
    }
}
