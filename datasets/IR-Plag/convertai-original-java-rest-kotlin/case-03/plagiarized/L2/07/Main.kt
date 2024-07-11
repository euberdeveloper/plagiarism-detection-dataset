package IR

import java.util.Scanner

/**
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
fun main() {
    val input = Scanner(System.`in`)
    // Masukan beban dalam satuan pounds
    print("Enter weight in pounds: ")
    val berat = input.nextDouble()
    // Masukan tinggi dalam satuan kaki dan inci
    print("Enter feet: ")
    val feet = input.nextDouble()
    print("Enter inches: ")
    val inches = input.nextDouble()
    val height = feet * 12 + inches
    // Hitung bmi di sini
    val bmi = berat * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    // Print hasil di sini
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 30 -> println("Overweight")
        else -> println("Obese")
    }
}
