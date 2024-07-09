package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        // Enter radius of the cylinder
        var r = 0.0
        var len = 0.0
        var a = 0.0
        var volume = 0.0

        print("Enter the radius and length of a cylinder: ")
        r = scan.nextDouble()
        len = scan.nextDouble()

        a = r * r * 3.14159
        volume = a * len
        //Output
        println("The area is $a")
        println("The volume of the cylinder is $volume")
    }
}
