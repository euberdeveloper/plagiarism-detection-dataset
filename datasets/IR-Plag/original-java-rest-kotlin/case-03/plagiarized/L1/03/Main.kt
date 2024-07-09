package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)


        //Prompt the user to enter weight in pounds 
        print("Enter weight in pounds: ")
        val weight = input.nextDouble()


        //Prompt the user to enter height
        print("Enter feet: ")
        val feet = input.nextDouble()
        print("Enter inches: ")
        val inches = input.nextDouble()

        val height = feet * 12 + inches


        //Compute BMI
        val bmi = (weight * 0.45359237
                / ((height * 0.0254) * (height * 0.0254)))


        //Display result
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
