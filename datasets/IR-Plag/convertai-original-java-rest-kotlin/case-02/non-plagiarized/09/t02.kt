package IR

import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the radius and length of a cylinder : ")
    val radius = sc.nextDouble()
    val length = sc.nextDouble()
    val area = radius * radius * 3.14159
    val volume = (radius * radius * 3.14159) * length
    val areaFormat = DecimalFormat("#.#####")
    val volumeFormat = DecimalFormat("#.#")

    println("The area is ${areaFormat.format(area)}")
    println("The volume is ${volumeFormat.format(volume)}")
}

