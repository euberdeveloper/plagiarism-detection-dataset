package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val weight = input.nextDouble() // inputan weight
    print("Enter feet: ")
    val feet = input.nextDouble() // inputan feet
    print("Enter inches: ")
    val inches = input.nextDouble() // inputan inches
    val height = feet * 12 + inches // menghitung tinggi
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254)) // menghitung BMI
    // menampilkan hasil
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

