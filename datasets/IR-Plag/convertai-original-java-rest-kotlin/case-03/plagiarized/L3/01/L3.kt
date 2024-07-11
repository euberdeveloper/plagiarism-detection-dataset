package IR

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var berat = 0.0
    var inci = 0.0
    var tinggi = 0.0
    var bmi = 0.0
    var feet = 0.0

    print("Enter weight in pounds: ")
    berat = sc.nextDouble()

    print("Enter feet: ")
    feet = sc.nextDouble()
    print("Enter inches: ")
    inci = sc.nextDouble()
    tinggi = feet * 12 + inci

    bmi = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

