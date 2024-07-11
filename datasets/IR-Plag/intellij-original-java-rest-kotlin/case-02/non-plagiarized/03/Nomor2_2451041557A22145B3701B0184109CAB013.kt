package IR

import java.util.*

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
object Nomor2_2451041557A22145B3701B0184109CAB013 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter the radius and length of a cylinder : ")
        val radius = sc.nextDouble()
        val length = sc.nextDouble()
        val area = (radius * radius) * 3.14159
        val volume = area * length
        println("The area is : $area")
        println("The volume is : $volume")
    }
}
