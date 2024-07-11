package IR

import java.util.*

object T02 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter the radius and length of a cylinder: ")
        val radlen = sc.nextLine()
        val splited = radlen.split("\\s+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val rad = splited[0].toFloat()
        val len = splited[1].toFloat()
        println("The area is " + Math.round(rad * rad * 3.14159 * 10000.0) / 10000.0)
        println("The volume is " + Math.round(rad * rad * 3.14159 * len * 10.0) / 10.0)
    }
}