package IR

import java.util.Scanner

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
fun hitungTinggi(feet: Double, inches: Double): Double {
    return feet * 12 + inches
}

fun hitungBmi(weight: Double, feet: Double, inches: Double): Double {
    return weight * 0.45359237 / ((hitungTinggi(feet, inches) * 0.0254) * (hitungTinggi(feet, inches) * 0.0254))
}

fun cekBmi(bmi: Double): String {
    return when {
        bmi < 18.5 -> "Underweight"
        bmi < 25 -> "Normal"
        bmi < 30 -> "Overweight"
        else -> "Obese"
    }
}

fun main() {
    val input = Scanner(System.`in`)
    // Prompt the user to enter weight in pounds
    print("Enter weight in pounds: ")
    val weight = input.nextDouble()
    // Prompt the user to enter height 
    print("Enter feet: ")
    val feet = input.nextDouble()
    print("Enter inches: ")
    val inches = input.nextDouble()
    // Display result
    println("BMI is ${hitungBmi(weight, feet, inches)}")
    println(cekBmi(hitungBmi(weight, feet, inches)))
}

