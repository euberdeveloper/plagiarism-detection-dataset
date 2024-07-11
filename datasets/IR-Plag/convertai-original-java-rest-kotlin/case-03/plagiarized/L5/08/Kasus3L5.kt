package IR

import java.util.Scanner

fun main() {
    println("Enter weight in pounds: ")
    val inp = Scanner(System.`in`)
    val berat = inp.nextDouble()

    println("Enter feet: ")
    val kaki = inp.nextDouble()
    println("Enter inches: ")
    val inch = inp.nextDouble()

    BMIKategori(hitungBMI(berat, kaki * 12 + inch))
}

private fun hitungBMI(weight: Double, height: Double): Double {
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
}

private fun BMIKategori(BMI: Double) {
    println("BMI is $BMI")
    when {
        BMI < 18.5 -> println("Underweight")
        BMI < 25 -> println("Normal")
        BMI < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

