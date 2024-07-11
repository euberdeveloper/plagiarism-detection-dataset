package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 51BE04B11C5F2F5AD96A396632DC3F76
 */

object t03 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter weight in pounds : ")
        val weight = sc.nextDouble()

        print("Enter feet : ")
        val feet = sc.nextDouble()

        print("Enter inches : ")
        val inches = sc.nextDouble()

        val height = feet * 12 + inches
        val bmi = weight * 0.45359237 / ((height * 0.0254)
                * (height * 0.0254))
        println("BMI is $bmi")
        if (bmi < 18.5) {
            println("underweight")
        } else if (bmi >= 18.5 && bmi < 25) {
            println("normal")
        } else if (bmi >= 25 && bmi < 35) {
            println("overweight")
        } else {
            println("obese")
        }
    }
}
