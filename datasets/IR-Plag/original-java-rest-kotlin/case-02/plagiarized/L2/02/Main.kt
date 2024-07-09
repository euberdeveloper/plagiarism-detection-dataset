package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)

        // Enter radius of the cylinder    
        print("Enter the radius and length of a cylinder: ")
        val r = scan.nextDouble()
        val len = scan.nextDouble()
        val a = r * r * 3.14159
        val volume = a * len
        //Output
        println("The area is $a")
        println("The volume of the cylinder is $volume")
    }
}
