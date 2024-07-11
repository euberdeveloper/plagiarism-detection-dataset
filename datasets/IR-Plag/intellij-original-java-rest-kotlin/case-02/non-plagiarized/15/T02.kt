package IR

import java.util.*

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
object T02 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val area: Double
        val volume: Double
        print("Enter the radius and length of a cylinder: ")
        val radius = sc.nextDouble()
        val length = sc.nextDouble()
        area = radius * radius * 3.14159
        volume = area * length
        println("The area is $area")
        println("The volume is $volume")
    }
}
