package IR

import java.util.Scanner

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var weight: Double
    var feet: Double
    var inches: Double
    var bmi: Double
    var height: Double
    println("Enter weight in pounds: ")
    weight = sc.nextDouble()
    println("Enter feet: ")
    feet = sc.nextDouble()
    println("Enter inches: ")
    inches = sc.nextDouble()
    height = feet * 12 + inches
    bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 35 -> println("Overweight")
        else -> println("Obese")
    }
}

