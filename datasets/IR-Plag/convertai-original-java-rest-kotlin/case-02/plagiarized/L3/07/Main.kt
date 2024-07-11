package IR

import java.util.Scanner

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    val input = Scanner(System.`in`)
    // Masukan radius silinder
    print("Enter the radius and length of a cylinder: ")
    val jejari = input.nextDouble()
    val panjang = input.nextDouble()

    val area = jejari * jejari * 3.14159
    val volume = area * panjang
    // Mencetak luas dan volume
    println("The area is $area")
    println("The volume of the cylinder is $volume")
}

