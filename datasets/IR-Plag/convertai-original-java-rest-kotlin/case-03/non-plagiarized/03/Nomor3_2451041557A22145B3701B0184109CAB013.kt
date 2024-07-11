package IR

import java.util.Scanner

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val weight = sc.nextInt()
    print("Enter feet: ")
    val feet = sc.nextInt()
    print("Enter inch: ")
    val inches = sc.nextInt()
    val height = feet * 12 + inches
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("underweight")
        bmi in 18.5..25 -> println("Normal")
        bmi in 25.0..35 -> println("overweight")
        bmi > 35 -> println("obese")
    }
}

