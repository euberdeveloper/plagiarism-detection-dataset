package IR

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var weight: Double
    var feet: Double
    var inches: Double
    var height: Double
    var bmi: Double

    print("Enter weight in pounds: ")
    weight = sc.nextDouble()

    print("Enter feet: ")
    feet = sc.nextDouble()

    print("Enter inches: ")
    inches = sc.nextDouble()

    height = feet * 12 + inches
    bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi >= 18.5 && bmi < 25 -> println("Normal")
        bmi >= 25 && bmi < 35 -> println("Overweight")
        bmi >= 35 -> println("Obese")
    }
}

