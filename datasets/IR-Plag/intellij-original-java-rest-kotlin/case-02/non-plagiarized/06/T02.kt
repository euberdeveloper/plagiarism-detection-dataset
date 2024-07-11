package IR

import java.util.*

/**
 *
 * @author Shiroinu
 */
object T02 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter the radius and the length of the cilinder : ")
        val rad = sc.nextDouble()
        val length = sc.nextDouble()
        val area = Math.PI * rad * rad
        val volume = Math.PI * rad * rad * length
        println("The area is $area")
        println("The volume is $volume")
    }
}
