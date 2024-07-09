package IR

import java.util.*

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
object Main {
    private var weights = 0.0
    private var feets = 0.0
    private var inches = 0.0
    private var heights = 0.0
    private var bmi = 0.0

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)


        //Prompt the user to enter weight in pounds 
        print("Enter weight in pounds: ")
        weights = input.nextDouble()


        //Prompt the user to enter height
        print("Enter feet: ")
        feets = input.nextDouble()
        print("Enter inches: ")
        inches = input.nextDouble()


        //Compute BMI
        heights = feets * 12 + inches
        bmi = (weights * 0.45359237
                / ((heights * 0.0254) * (heights * 0.0254)))
        cetak()
    }

    fun cetak() {
        //Display result
        println("BMI is " + bmi)
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
