package IR

import java.util.Scanner

/**
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
fun main() {
    val s = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val weight = s.nextDouble()
    print("Enter feet: ")
    val feet = s.nextDouble()
    print("Enter inches: ")
    val inches = s.nextDouble()

    val height = feet * 12 + inches
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("BMI Is $bmi")

    when {
        bmi < 18.5 -> println("Underweight")
        bmi in 18.5..25 -> println("Normal")
        bmi in 25.0..35 -> println("Overweight")
        else -> println("Obese")
    }
}

