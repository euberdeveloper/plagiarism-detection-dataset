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
object Kasus3L5 {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter weight in pounds: ")
        val inp = Scanner(System.`in`)
        val berat = inp.nextDouble()

        print("Enter feet: ")
        val kaki = inp.nextDouble()
        print("Enter inches: ")
        val inch = inp.nextDouble()

        BMIKategori(hitungBMI(berat, kaki * 12 + inch))
    }

    private fun hitungBMI(weight: Double, height: Double): Double {
        return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    }

    private fun BMIKategori(BMI: Double) {
        println("BMI is $BMI")
        if (BMI < 18.5) println("Underweight")
        else if (BMI < 25) println("Normal")
        else if (BMI < 30) println("Overweight")
        else println("Obese")
    }
}
