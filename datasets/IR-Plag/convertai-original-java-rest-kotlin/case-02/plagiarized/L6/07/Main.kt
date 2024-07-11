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

    // Mencetak luas dan volume
    println("The area is ${hitungArea(jejari)}")
    println("The volume of the cylinder is ${hitungVolume(panjang, jejari)}")
}

fun hitungArea(jejari: Double): Double {
    return Math.pow(jejari, 2.0) * 3.14159
}

fun hitungVolume(panjang: Double, jejari: Double): Double {
    return hitungArea(jejari) * panjang
}

