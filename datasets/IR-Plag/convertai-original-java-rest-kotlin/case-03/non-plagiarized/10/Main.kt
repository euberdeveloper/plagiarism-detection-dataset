package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val weight = sc.nextInt()
    print("Enter feet: ")
    val feet = sc.nextInt()
    print("Enter inches: ")
    val inches = sc.nextInt()
    val height = feet * 12 + inches
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi in 18.5..25 -> println("Normal")
        bmi in 25.0..35 -> println("Overweight")
        else -> println("Obese")
    }
}

