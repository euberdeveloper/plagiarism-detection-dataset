package IR

import java.util.*

/**
 *
 * @author 672CAF27F5363DC833BDA5099775E891
 */
object Main {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter the radius and length of a cylinder:")
        val sc = Scanner(System.`in`)
        val radius = sc.nextDouble()
        val length = sc.nextInt()
        val area = radius * radius * 3.14159
        val volume = length * radius
        println("The area is $area")
        println("The volume is $volume")
    }
}
