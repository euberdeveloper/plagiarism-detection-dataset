package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        // Prompt the user to enter weight in pounds

        //enter inches
        print("Enter inches: ")
        val inchesUser = sc.nextDouble()

        print("Enter weight in pounds: ")
        val weightUser = sc.nextDouble()
        // Prompt the user to enter height
        //enter feet
        print("Enter feet: ")
        val feetUser = sc.nextDouble()

        //process
        val heightUser = feetUser * 12 + inchesUser
        // Compute BMI
        val bmi = weightUser * 0.45359237 / ((heightUser * 0.0254) * (heightUser * 0.0254))
        // Display result
        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }
}
