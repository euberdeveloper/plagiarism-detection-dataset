package IR

import java.util.*

object Main {
    fun countHeightUser(feet: Double, inches: Double): Double {
        return feet * 12 + inches
    }

    fun countBmi(height: Double, weight: Double): Double {
        return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    }

    fun printBmi(bmi: Double) {
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }

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
        val heightUser = countHeightUser(feetUser, inchesUser)
        // Compute BMI
        val bmi = countBmi(heightUser, weightUser)
        // Display result
        println("BMI is $bmi")
        printBmi(bmi)
    }
}
