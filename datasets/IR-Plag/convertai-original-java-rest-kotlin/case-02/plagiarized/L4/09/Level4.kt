package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val input = Scanner(System.`in`)
    // masukkan nilai
    print("Enter the radius and length of a cylinder: ")
    val radius = input.nextDouble()
    val tinggi = input.nextDouble()

    println("The area is ${hitungLuasAlas(radius)}")
    println("The volume of the cylinder is ${hitungVolume(hitungLuasAlas(radius), tinggi)}")
}

// fungsi luas alas
fun hitungLuasAlas(rad: Double): Double {
    val luasAlas = rad * rad * 3.14159
    return luasAlas
}

// fungsi volume
fun hitungVolume(luasAlas: Double, tinggi: Double): Double {
    val volume = luasAlas * tinggi
    return volume
}

