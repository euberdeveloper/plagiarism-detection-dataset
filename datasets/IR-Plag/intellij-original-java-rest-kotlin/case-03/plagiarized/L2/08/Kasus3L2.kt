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
object Kasus3L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val inp = Scanner(System.`in`)

        print("Enter weight in pounds: ")
        val berat = inp.nextDouble()

        print("Enter feet: ")
        val kaki = inp.nextDouble()
        print("Enter inches: ")
        val inch = inp.nextDouble()
        val tinggi = kaki * 12 + inch

        val rata = berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))

        println("BMI is $rata")
        if (rata < 18.5) println("Underweight")
        else if (rata < 25) println("Normal")
        else if (rata < 30) println("Overweight")
        else println("Obese")
    }
}
