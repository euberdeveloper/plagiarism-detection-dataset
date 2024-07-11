package IR

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    var w: Double
    var f: Double
    var i: Double
    var h: Double
    var TotalBmi: Double

    print("Enter weight in pounds : ")
    w = input.nextDouble() // inputan weight

    print("Enter feet : ")
    f = input.nextDouble() // inputan feet

    print("Enter inches : ")
    i = input.nextDouble() // inputan inches

    h = f * 12 + i // menghitung tinggi
    TotalBmi = w * 0.45359237 / ((h * 0.0254) * (h * 0.0254)) // menghitung BMI

    // menampilkan hasil
    println("BMI is $TotalBmi")
    when {
        TotalBmi < 18.5 -> println("Underweight ")
        TotalBmi < 25 -> println("Normal ")
        TotalBmi < 30 -> println("Overweight ")
        else -> println("Obese ")
    }
}

