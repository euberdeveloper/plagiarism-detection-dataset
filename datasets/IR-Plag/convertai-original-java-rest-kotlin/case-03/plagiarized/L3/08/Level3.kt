package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var berat: Double
        var feet: Double
        var inches: Double
        var tinggi: Double
        var bmi: Double

        print("Enter weight in pounds: ")
        berat = `in`.nextDouble()
        print("Enter feet: ")
        feet = `in`.nextDouble()
        print("Enter inches: ")
        inches = `in`.nextDouble()
        tinggi = feet * 12 + inches

        bmi = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

        println("BMI is $bmi")
        when {
            bmi < 18.5 -> println("Underweight")
            bmi < 25 -> println("Normal")
            bmi < 30 -> println("Overweight")
            else -> println("Obese")
        }
    }
}

