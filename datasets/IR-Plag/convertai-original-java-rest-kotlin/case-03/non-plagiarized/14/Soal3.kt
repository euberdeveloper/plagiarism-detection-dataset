package IR

import java.text.DecimalFormat
import java.util.Scanner

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val weight = sc.nextDouble()
    print("Enter feet: ")
    val feet = sc.nextDouble()
    print("Enter inches: ")
    val inches = sc.nextDouble()
    val height = feet * 12 + inches
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi >= 18.5 && bmi < 25 -> println("Normal")
        bmi >= 25 && bmi < 35 -> println("Overweight")
        else -> println("Obese")
    }
}

