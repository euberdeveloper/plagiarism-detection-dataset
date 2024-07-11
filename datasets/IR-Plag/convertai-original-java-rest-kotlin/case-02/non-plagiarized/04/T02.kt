package IR

import java.text.DecimalFormat
import java.util.Scanner

fun main() {
    val s = Scanner(System.`in`)
    println("Enter the radius and length of a cylinder :")
    val radius = s.nextDouble()
    val length = s.nextDouble()
    val area = radius * radius * 3.14159

    val df = DecimalFormat(".####")
    val df2 = DecimalFormat(".#")
    val volume = area * length
    println("The area is ${df.format(area)}")
    println("The volume is ${df2.format(volume)}")
}

