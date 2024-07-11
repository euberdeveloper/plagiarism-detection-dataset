package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the radius and length of a cylinder: ")
    val radlen = sc.nextLine()
    val splited = radlen.split("\\s+".toRegex())
    val rad = splited[0].toFloat()
    val len = splited[1].toFloat()
    println("The area is ${(rad * rad * Math.PI * 10000.0).roundToInt() / 10000.0}")
    println("The volume is ${(rad * rad * Math.PI * len * 10.0).roundToInt() / 10.0}")
}

