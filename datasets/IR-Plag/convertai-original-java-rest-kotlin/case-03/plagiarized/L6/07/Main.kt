package IR

import java.util.Scanner

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    val input = Scanner(System.`in`)
    var berat: Double
    var feet: Double
    var inches: Double
    var height: Double
    var bmi: Double

    // Masukan beban dalam satuan pounds
    print("Enter weight in pounds: ")
    berat = input.nextDouble()
    // Masukan tinggi dalam satuan kaki dan inci
    print("Enter feet: ")
    feet = input.nextDouble()
    print("Enter inches: ")
    inches = input.nextDouble()
    height = feet * 12 + inches
    // Hitung bmi di sini
    bmi = hitungBmi(berat, height)
    // Print hasil di sini
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

fun hitungBmi(berat: Double, height: Double): Double {
    return berat * 0.45359237 / (Math.pow((height * 0.0254), 2.0))
}

