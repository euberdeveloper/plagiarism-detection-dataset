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
    var inchesUser: Double
    var weightUser: Double
    var feetUser: Double
    var heightUser: Double
    var bmi: Double

    // Enter inches
    print("Enter inches: ")
    inchesUser = sc.nextDouble()

    // Prompt the user to enter weight in pounds
    print("Enter weight in pounds: ")
    weightUser = sc.nextDouble()

    // Prompt the user to enter height
    // Enter feet
    print("Enter feet: ")
    feetUser = sc.nextDouble()

    // Process
    heightUser = countHeightUser(feetUser, inchesUser)
    // Compute BMI
    bmi = countBmi(heightUser, weightUser)
    // Display result
    print("BMI is ")
    println(bmi)
    printBmi(bmi)
}

