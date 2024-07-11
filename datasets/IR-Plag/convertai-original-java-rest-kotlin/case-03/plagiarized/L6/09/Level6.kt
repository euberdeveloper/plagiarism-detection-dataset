package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var berat: Double
        var feet: Double
        var inches: Double
        var tinggi: Double

        print("Enter weight in pounds: ")
        berat = `in`.nextDouble()
        print("Enter feet: ")
        feet = `in`.nextDouble()
        print("Enter inches: ")
        inches = `in`.nextDouble()

        result(fungsiBmi(berat, feet, inches))
    }

    private fun fungsiBmi(berat: Double, feet: Double, inches: Double): Double {
        val tinggi = feet * 12 + inches
        return berat * 0.45359237 / Math.pow((tinggi * 0.0254), 2.0)
    }

    private fun result(res: Double) {
        println("BMI is $res")
        when {
            res < 18.5 -> println("Underweight")
            res in 18.5..25 -> println("Normal")
            res in 25.0..30.0 -> println("Overweight")
            else -> println("Obese")
        }
    }
}

