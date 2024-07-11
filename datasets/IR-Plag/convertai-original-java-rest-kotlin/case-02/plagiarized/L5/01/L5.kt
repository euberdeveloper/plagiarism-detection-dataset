package IR

import java.util.*

fun hitLuas(jari2: Double): Double {
    return jari2 * jari2 * 3.14159
}

fun total(luas: Double, panjang: Double): Double {
    return luas * panjang
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var jari2: Double
    var panjang: Double
    var luas: Double
    var total: Double
    println("Enter the radius and length of a cylinder: ")
    jari2 = input.nextDouble()
    panjang = input.nextDouble()
    luas = hitLuas(jari2)
    total = total(luas, panjang)

    println("The area is $luas , ")
    println("The volume of the cylinder is $total")
}

