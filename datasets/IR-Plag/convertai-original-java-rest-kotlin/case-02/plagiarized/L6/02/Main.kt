package IR

import java.util.Scanner

fun area(r: Double): Double {
    val area = r * r * 3.14159
    return area
}

fun volume(len: Double, a: Double): Double {
    val volume = len * a
    return volume
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    // Enter radius of the cylinder    
    var r: Double
    var len: Double
    var a: Double

    print("Enter the radius and length of a cylinder: ")
    r = scan.nextDouble()
    len = scan.nextDouble()

    a = area(r)

    //Output
    println("The area is ${ area(r) }")
    println("The volume of the cylinder is ${ volume(len, a) }")
}

