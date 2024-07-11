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
    TotalBmi = hitBMI(w, h) // menghitung BMI

    // menampilkan hasil
    println("BMI is $TotalBmi")
    result(TotalBmi)
}

fun hitBMI(w: Double, h: Double): Double {
    return (w * 0.45359237) / ((h * 0.0254) * (h * 0.0254))
}

fun result(TotalBmi: Double) {
    when {
        TotalBmi > 30 -> println("Obese ")
        TotalBmi < 25 && TotalBmi > 18.5 -> println("Normal ")
        TotalBmi > 25 && TotalBmi < 30 -> println("Overweight ")
        else -> println("Underweight ")
    }
}

