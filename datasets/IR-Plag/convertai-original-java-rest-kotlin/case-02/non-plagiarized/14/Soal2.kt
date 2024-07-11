package IR

import java.text.DecimalFormat
import java.util.Scanner

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
fun main() {
    val sc = Scanner(System.`in`)
    val dfArea = DecimalFormat("#.####")
    val dfVolume = DecimalFormat("#.#")

    print("Enter the radius and length of a cylinder: ")
    val radius = sc.nextDouble()
    val panjang = sc.nextDouble()
    println("The area is ${dfArea.format(radius * radius * 3.14159)}")
    println("The volume is ${dfVolume.format((radius * radius * 3.14159) * panjang)}")
}

