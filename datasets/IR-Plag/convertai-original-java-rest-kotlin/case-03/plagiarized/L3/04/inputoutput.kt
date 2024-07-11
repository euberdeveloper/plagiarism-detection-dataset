package IR

import java.util.Scanner

fun main() {
    var kaki: Double
    var bobot: Double
    var bmi: Double
    var inc: Double
    var height: Double
    val input = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    bobot = input.nextDouble()
    print("Enter feet: ")
    kaki = input.nextDouble()
    print("Enter inches: ")
    inc = input.nextDouble()
    height = kaki * 12 + inc
    bmi = bobot * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

    // hasil
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

