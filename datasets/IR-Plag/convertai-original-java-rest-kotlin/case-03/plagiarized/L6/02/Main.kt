package IR

import java.util.Scanner

fun countHeightUser(feet: Double, inches: Double): Double {
    return feet * 12 + inches
}

fun countBmi(height: Double, weight: Double): Double {
    return weight * 0.45359237 / (Math.pow((height * 0.0254), 2.0))
}

fun printBmi(bmi: Double) {
    when {
        bmi < 18.5 -> println("Underweight")
        bmi in 18.5..25 -> println("Normal")
        bmi in 25.0..30 -> println("Overweight")
        bmi > 30 -> println("Obese")
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
    println("BMI is $bmi")
    printBmi(bmi)
}

