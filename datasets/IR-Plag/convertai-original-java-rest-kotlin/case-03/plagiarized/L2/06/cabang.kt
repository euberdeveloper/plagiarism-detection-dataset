package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Enter weight in pounds : ")
    val w = input.nextDouble() // inputan weight
    print("Enter feet : ")
    val f = input.nextDouble() // inputan feet
    print("Enter inches : ")
    val i = input.nextDouble() // inputan inches
    val h = f * 12 + i // menghitung tinggi
    val TotalBmi = w * 0.45359237 / ((h * 0.0254) * (h * 0.0254)) // menghitung BMI
    // menampilkan hasil
    println("BMI is $TotalBmi")
    when {
        TotalBmi < 18.5 -> println("Underweight ")
        TotalBmi < 25 -> println("Normal ")
        TotalBmi < 30 -> println("Overweight ")
        else -> println("Obese ")
    }
}

