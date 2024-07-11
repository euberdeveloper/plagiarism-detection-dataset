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
object Level5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var berat = 0.0
        var tinggi = 0.0

        print("Enter weight in pounds: ")
        berat = `in`.nextDouble()
        print("Enter feet: ")
        val feet = `in`.nextDouble()
        print("Enter inches: ")
        val inches = `in`.nextDouble()

        tinggi = feet * 12 + inches

        bmi(berat, tinggi)
    }

    private fun bmi(weight: Double, height: Double) {
        val bmi: Double = weight * 0.45359237 / (height * 0.0254).pow(2.0)

        println("BMI is $bmi")

        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }
}
