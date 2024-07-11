package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus3L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)

        print("Enter weight in pounds: ")
        val weight = input.nextDouble()

        print("Enter feet: ")
        val feet = input.nextDouble()
        print("Enter inches: ")
        val inches = input.nextDouble()
        val height = feet * 12 + inches

        val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }
}
