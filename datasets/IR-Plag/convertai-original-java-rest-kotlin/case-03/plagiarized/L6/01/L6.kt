package IR

import java.util.Scanner

fun hitBmi(berat: Double, tinggi: Double): Double {
    return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var berat: Double
    var inci: Double
    var tinggi: Double
    var feet = 0.0

    print("Enter weight in pounds: ")
    berat = sc.nextDouble()

    print("Enter feet: ")
    feet = sc.nextDouble()
    print("Enter inches: ")
    inci = sc.nextDouble()
    tinggi = feet * 12 + inci

    println("BMI is ${"%.2f".format(hitBmi(berat, tinggi))}")
    when {
        hitBmi(berat, tinggi) < 25 && hitBmi(berat, tinggi) > 18.5 -> println("Normal")
        hitBmi(berat, tinggi) < 30 && hitBmi(berat, tinggi) > 25 -> println("Overweight")
        hitBmi(berat, tinggi) > 30 -> println("Obese")
        else -> println("Underweight")
    }
}

