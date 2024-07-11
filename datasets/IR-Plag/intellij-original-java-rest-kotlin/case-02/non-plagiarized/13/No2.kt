package IR

import java.util.*

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
object No2 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        // TODO code application logic here
        val radius: Double
        val length: Double
        val volume: Double
        val sc = Scanner(System.`in`)
        print("Enter the radius and length of a cylinder: ")
        radius = sc.nextDouble()
        length = sc.nextDouble()
        val area = radius * radius * 3.14159
        volume = area * length
        println("The area is $area")
        println("The volume is $volume")
    }
}
