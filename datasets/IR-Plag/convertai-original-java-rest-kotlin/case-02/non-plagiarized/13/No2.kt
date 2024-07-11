package IR

import java.util.Scanner

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
fun main() {
    // TODO code application logic here
    var radius: Double
    var length: Double
    var area: Double
    var volume: Double
    val sc = Scanner(System.`in`)
    print("Enter the radius and length of a cylinder: ")
    radius = sc.nextDouble()
    length = sc.nextDouble()
    area = radius * radius * 3.14159
    volume = area * length
    println("The area is $area")
    println("The volume is $volume")
}

