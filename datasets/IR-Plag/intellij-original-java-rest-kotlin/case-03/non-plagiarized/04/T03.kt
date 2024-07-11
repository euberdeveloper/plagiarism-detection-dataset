package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
object T03 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val weight = s.nextDouble()
        print("Enter feet: ")
        val feet = s.nextDouble()
        print("Enter inches: ")
        val inches = s.nextDouble()

        val height = feet * 12 + inches
        val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
        println("BMI Is $bmi")

        if (bmi < 18.5) {
            println("Underweight")
        } else if (bmi >= 18.5 && bmi < 25) {
            println("Normal")
        } else if (bmi >= 25 && bmi < 35) {
            println("Overweight")
        } else {
            println("Obese")
        }
    }
}
