package IR

import java.util.Scanner

fun countHeightUser(feet: Double, inches: Double): Double {
    return feet * 12 + inches
}

fun countBmi(height: Double, weight: Double): Double {
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
}

fun printBmi(bmi: Double) {
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    // Prompt the user to enter weight in pounds
    print("Enter inches: ")
    val inchesUser = sc.nextDouble()

    print("Enter weight in pounds: ")
    val weightUser = sc.nextDouble()

    // Prompt the user to enter height
    print("Enter feet: ")
    val feetUser = sc.nextDouble()

    // Process
    val heightUser = countHeightUser(feetUser, inchesUser)
    // Compute BMI
    val bmi = countBmi(heightUser, weightUser)
    // Display result
    println("BMI is $bmi")
    printBmi(bmi)
}

