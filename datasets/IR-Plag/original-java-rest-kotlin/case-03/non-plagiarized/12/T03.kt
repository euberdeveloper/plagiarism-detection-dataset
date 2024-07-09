package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 95F548D9E3DDDD7F63A8FCEF1E4957F4 F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
object T03 {
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
            println("Underweight")
        } else if (bmi >= 18.5 && bmi < 25) {
            println("Normal")
        } else if (bmi >= 25 && bmi < 35) {
            println("Overweight")
        } else {
            println("obese")
        }
    }
}
