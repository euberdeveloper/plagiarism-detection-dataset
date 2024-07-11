package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val bobot = input.nextDouble()
    print("Enter feet: ")
    val kaki = input.nextDouble()
    print("Enter inches: ")
    val inc = input.nextDouble()
    val height = kaki * 12 + inc
    val bmi = bobot * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

    // hasil
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

