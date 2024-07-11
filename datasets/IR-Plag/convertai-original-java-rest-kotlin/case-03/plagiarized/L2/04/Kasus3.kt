package IR

import java.util.Scanner

/**
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
fun hitungTinggi(feet: Double, inches: Double): Double {
    return feet * 12 + inches
}

fun hitungBmi(weight: Double, height: Double): Double {
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
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
    val height = hitungTinggi(feet, inches)
    // Compute BMI
    val bmi = hitungBmi(weight, height)
    // Display result
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

