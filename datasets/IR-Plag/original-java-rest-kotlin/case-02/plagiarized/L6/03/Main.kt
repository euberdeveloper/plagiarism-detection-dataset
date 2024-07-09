package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    private var radius = 0.0
    private var length = 0.0
    private var areas = 0.0
    private var volumes = 0.0

    @JvmStatic
    fun main(args: Array<String>) {
        //Enter radius of the cylinder
        print("Enter the radius and length of a cylinder: ")
        val input = Scanner(System.`in`)
        radius = input.nextDouble()
        length = input.nextDouble()
        areas = radius * radius * 3.14159
        volumes = areas * length
        cetak()
    }

    fun cetak() {
        println("The area is " + areas)
        println("The volume of the cylinder is " + volumes)
    }
}
