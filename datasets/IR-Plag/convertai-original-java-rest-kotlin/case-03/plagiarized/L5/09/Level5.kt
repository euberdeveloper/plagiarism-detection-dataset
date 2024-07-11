package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var berat = 0.0
        var feet: Double
        var inches: Double
        var tinggi = 0.0

        print("Enter weight in pounds: ")
        berat = `in`.nextDouble()
        print("Enter feet: ")
        feet = `in`.nextDouble()
        print("Enter inches: ")
        inches = `in`.nextDouble()

        tinggi = feet * 12 + inches

        bmi(berat, tinggi)
    }

    private fun bmi(weight: Double, height: Double) {
        val bmi = weight * 0.45359237 / Math.pow((height * 0.0254), 2.0)

        println("BMI is $bmi")

        when {
            bmi < 18.5 -> println("Underweight")
            bmi < 25 -> println("Normal")
            bmi < 30 -> println("Overweight")
            else -> println("Obese")
        }
    }
}

