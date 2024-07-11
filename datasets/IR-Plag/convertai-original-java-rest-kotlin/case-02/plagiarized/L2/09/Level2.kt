package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val `in` = Scanner(System.`in`)

    print("Enter the radius and length of a cylinder: ")
    val rad = `in`.nextDouble()
    val panjang = `in`.nextDouble()

    val luas = rad * rad * 3.14159
    val vol = luas * panjang
    println("The area is $luas")
    println("The volume of the cylinder is $vol")
}

