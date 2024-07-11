package IR

import java.util.Scanner

fun main() {
    println("Enter weight in pounds: ")
    val inp = Scanner(System.`in`)
    val berat = inp.nextDouble()

    println("Enter feet: ")
    val kaki = inp.nextDouble()
    println("Enter inches: ")
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

