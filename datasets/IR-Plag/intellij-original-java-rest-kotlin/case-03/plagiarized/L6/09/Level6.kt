package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var tinggi: Double

        print("Enter weight in pounds: ")
        val berat = `in`.nextDouble()
        print("Enter feet: ")
        val feet = `in`.nextDouble()
        print("Enter inches: ")
        val inches = `in`.nextDouble()

        result(fungsiBmi(berat, feet, inches))
    }

    private fun fungsiBmi(berat: Double, feet: Double, inches: Double): Double {
        val tinggi = feet * 12 + inches
        return berat * 0.45359237 / (tinggi * 0.0254).pow(2.0)
    }

    private fun result(res: Double) {
        println("BMI is $res")
        if (res < 18.5) println("Underweight")
        else if (res >= 18.5 && res < 25) println("Normal")
        else if (res >= 25 && res < 30) println("Overweight")
        else println("Obese")
    }
}
