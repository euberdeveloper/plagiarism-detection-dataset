package IR

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    // Enter radius of the cylinder
    var r: Double = 0.0
    var len: Double = 0.0
    var a: Double = 0.0
    var volume: Double = 0.0

    println("Enter the radius and length of a cylinder: ")
    r = scan.nextDouble()
    len = scan.nextDouble()

    a = r * r * 3.14159
    volume = a * len
    //Output
    println("The area is $a")
    println("The volume of the cylinder is $volume")
}

