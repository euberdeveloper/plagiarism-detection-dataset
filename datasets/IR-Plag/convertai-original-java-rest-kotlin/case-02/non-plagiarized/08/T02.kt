package IR

import java.util.Scanner

/**
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter the radius and length of a cylinder:")
    val radius = sc.nextDouble()
    val length = sc.nextDouble()
    val area = Math.pow(radius, 2.0) * Math.PI
    val volume = area * length
    println("The area is $area")
    println("The volume is $volume")
}

