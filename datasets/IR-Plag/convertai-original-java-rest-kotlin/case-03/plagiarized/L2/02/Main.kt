package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    // Prompt the user to enter weight in pounds
    print("Enter weight in pounds: ")
    val weightUser = sc.nextDouble()
    // Prompt the user to enter height
    //enter feet
    print("Enter feet: ")
    val feetUser = sc.nextDouble()
    //enter inches
    print("Enter inches: ")
    val inchesUser = sc.nextDouble()

    //process
    val heightUser = feetUser * 12 + inchesUser
    // Compute BMI
    val bmi = weightUser * 0.45359237 / ((heightUser * 0.0254) * (heightUser * 0.0254))
    // Display result
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

