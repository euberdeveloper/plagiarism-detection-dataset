package IR

import java.util.Scanner

fun main() {
    val masukan = Scanner(System.`in`)
    var rad: Double
    var panjang: Double

    // masukan silinder
    println("Enter the radius and length of a cylinder: ")
    rad = masukan.nextDouble()
    panjang = masukan.nextDouble()

    val a = rad * rad * 3.14159
    val vol = a * panjang

    // cetak hasil
    println("The area is $a")
    println("The volume of the cylinder is $vol")
}

