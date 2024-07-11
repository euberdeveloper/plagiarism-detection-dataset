package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
fun main() {
    val input = Scanner(System.`in`)

    // masukkan berat dan tinggi
    print("Enter weight in pounds: ")
    val weight = input.nextDouble()
    print("Enter feet: ")
    val feet = input.nextDouble()
    print("Enter inches: ")
    val inches = input.nextDouble()
    val height = feet * 12 + inches

    // hitung BMI
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

    // kategori
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

