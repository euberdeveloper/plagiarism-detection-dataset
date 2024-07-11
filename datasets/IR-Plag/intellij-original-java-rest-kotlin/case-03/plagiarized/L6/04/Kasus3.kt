package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus3 {
    fun hitungTinggi(feet: Double, inches: Double): Double {
        return feet * 12 + inches
    }

    fun hitungBmi(weight: Double, feet: Double, inches: Double): Double {
        return weight * 0.45359237 / ((hitungTinggi(feet, inches) * 0.0254) * (hitungTinggi(feet, inches) * 0.0254))
    }

    fun cekBmi(bmi: Double): String {
        return if (bmi < 18.5) {
            "Underweight"
        } else if (bmi < 25) {
            "Normal"
        } else if (bmi < 30) {
            "Overweight"
        } else {
            "Obese"
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        // Prompt the user to enter weight in pounds
        print("Enter weight in pounds: ")
        val weight = input.nextDouble()
        // Prompt the user to enter height 
        print("Enter feet: ")
        val feet = input.nextDouble()
        print("Enter inches: ")
        val inches = input.nextDouble()
        // Display result
        println("BMI is " + hitungBmi(weight, feet, inches))
        println(cekBmi(hitungBmi(weight, feet, inches)))
    }
}
