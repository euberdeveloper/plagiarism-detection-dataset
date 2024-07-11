package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val `in` = Scanner(System.`in`)
    var berat: Double
    var kaki: Double
    var inchi: Double
    var tinggi: Double

    print("Enter weight in pounds: ")
    berat = `in`.nextDouble()
    print("Enter feet: ")
    kaki = `in`.nextDouble()
    print("Enter inches: ")
    inchi = `in`.nextDouble()
    tinggi = kaki * 12 + inchi

    hitungBmi(berat, tinggi)
}

//calculate BMI and output message
private fun hitungBmi(weight: Double, height: Double) {
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

