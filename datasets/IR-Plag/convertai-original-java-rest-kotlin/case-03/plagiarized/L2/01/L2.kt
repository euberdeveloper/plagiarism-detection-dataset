package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    print("Enter weight in pounds: ")
    val berat = sc.nextDouble()

    print("Enter feet: ")
    val feet = sc.nextDouble()
    print("Enter inches: ")
    val inci = sc.nextDouble()
    val tinggi = feet * 12 + inci

    val bmi = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

