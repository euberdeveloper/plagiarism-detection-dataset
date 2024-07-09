package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
object T03 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val weight = sc.nextDouble()
        print("Enter feet: ")
        val feet = sc.nextDouble()
        print("Enter Inches: ")
        val inches = sc.nextDouble()
        val height = feet * 12 + inches
        val bmi: Double = weight * 0.45359237 / (height * 0.0254).pow(2.0)
        println("BMI is $bmi")
        if (bmi < 18.5) {
            println("underweight")
        } else if (bmi < 25) {
            println("normal")
        } else if (bmi < 35) {
            println("overweight")
        } else {
            println("obese")
        }
    }
}
