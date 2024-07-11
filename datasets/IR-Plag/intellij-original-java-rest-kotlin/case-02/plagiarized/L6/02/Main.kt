package IR

import java.util.*

object Main {
    fun area(r: Double): Double {
        val area = r * r * 3.14159
        return area
    }

    fun volume(len: Double, a: Double): Double {
        val volume = len * a
        return volume
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val a: Double


        print("Enter the radius and length of a cylinder: ")
        // Enter radius of the cylinder    
        val r = scan.nextDouble()
        val len = scan.nextDouble()

        a = area(r)

        //Output
        println("The area is " + area(r))
        println("The volume of the cylinder is " + volume(len, a))
    }
}
