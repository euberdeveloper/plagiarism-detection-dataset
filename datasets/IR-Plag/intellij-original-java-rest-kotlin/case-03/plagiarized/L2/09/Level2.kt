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
object Level2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)

        print("Enter weight in pounds: ")
        val berat = `in`.nextDouble()
        print("Enter feet: ")
        val feet = `in`.nextDouble()
        print("Enter inches: ")
        val inches = `in`.nextDouble()
        val tinggi = feet * 12 + inches

        val bmi = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }
}
