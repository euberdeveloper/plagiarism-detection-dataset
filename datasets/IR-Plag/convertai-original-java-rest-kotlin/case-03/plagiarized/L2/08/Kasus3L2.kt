package IR

import java.util.Scanner

fun main() {
    val inp = Scanner(System.`in`)

    print("Enter weight in pounds: ")
    val berat = inp.nextDouble()

    print("Enter feet: ")
    val kaki = inp.nextDouble()
    print("Enter inches: ")
    val inch = inp.nextDouble()
    val tinggi = kaki * 12 + inch

    val rata = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

    println("BMI is $rata")
    when {
        rata < 18.5 -> println("Underweight")
        rata < 25 -> println("Normal")
        rata < 30 -> println("Overweight")
        else -> println("Obese")
    }
}

