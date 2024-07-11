package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        // Masukan beban dalam satuan pounds
        print("Enter weight in pounds: ")
        val weight = input.nextDouble()
        // Masukan tinggi dalam satuan kaki dan inci
        print("Enter feet: ")
        val feet = input.nextDouble()
        print("Enter inches: ")
        val inches = input.nextDouble()
        val height = feet * 12 + inches
        // Hitung bmi di sini
        val bmi = (weight * 0.45359237
                / ((height * 0.0254) * (height * 0.0254)))
        // Print hasil di sini
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
