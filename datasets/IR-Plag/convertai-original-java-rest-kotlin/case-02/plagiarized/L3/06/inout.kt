package IR

import java.util.Scanner

fun main() {
    var rad: Double
    var l: Double
    var ar: Double
    var vol: Double
    val sc = Scanner(System.`in`)
    // Enter radius of the cylinder
    print("Enter the radius and length of a cylinder : ") // untuk print
    rad = sc.nextDouble() // menginput radius
    l = sc.nextDouble() // menginput length
    ar = rad * rad * 3.14159 // mencari area
    vol = ar * l // mencari voulume
    println("The area is $ar") // mengeluarkan hasil
    println("The volume of the cylinder is $vol") // mengeluarkan hasil
}

