package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter the radius and length of a cylinder: ")
        val radius = sc.nextDouble()
        val length = sc.nextInt()

        val area = radius * radius * 3.14159
        println("The area is $area")
        println("The volume is " + area * length)
    }
}
