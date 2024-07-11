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

    // Print Hasil perhitungan
    BMIKategori(hitungBMI(berat, kaki * 12 + inch))
}

private fun hitungBMI(weight: Double, height: Double): Double {
    val temp = height * 0.0254
    return weight * 0.45359237 / (temp * temp)
}

private fun BMIKategori(BMI: Double) {
    println("BMI is $BMI")
    when {
        BMI > 30 -> println("Obese")
        BMI > 25 -> println("Overweight")
        BMI > 18.5 -> println("Normal")
        else -> println("Underweight")
    }
}

