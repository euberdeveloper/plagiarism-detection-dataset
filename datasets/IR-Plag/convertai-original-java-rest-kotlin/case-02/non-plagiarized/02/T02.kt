package IR

import java.util.Scanner

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
fun main() {
    val s = Scanner(System.`in`)
    println("Enter the radius and length of a cylinder: ")
    val r = s.nextFloat()
    val l = s.nextFloat()
    println("The area is ${r * r * 3.14159}")
    println("The volume is ${(r * r * 3.14159) * l}")
}

