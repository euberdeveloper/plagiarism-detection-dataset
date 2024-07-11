package IR

import java.util.*

object L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)

        print("Enter weight in pounds: ")
        val weight = input.nextDouble()

        print("Enter feet: ")
        val feet = input.nextDouble()
        print("Enter inches: ")
        val inches = input.nextDouble()
        val height = feet * 12 + inches

        val bmi = (weight * 0.45359237
                / ((height * 0.0254) * (height * 0.0254)))

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
