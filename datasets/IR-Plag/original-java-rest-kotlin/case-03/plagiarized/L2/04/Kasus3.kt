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

    fun hitungBmi(weight: Double, height: Double): Double {
        return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
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
        val height = hitungTinggi(feet, inches)
        // Compute BMI
        val bmi = hitungBmi(weight, height)
        // Display result
        println("BMI is $bmi")
        if (bmi < 18.5) {
            println("Underweight")
        } else if (bmi < 25) {
            println("Normal")
        } else if (bmi < 30) {
            println("Overweight")
        } else {
            println("Obese")
        }
    }
}
