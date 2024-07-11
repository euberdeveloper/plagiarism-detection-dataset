package IR

import java.util.*

internal object inputoutput {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("Enter weight in pounds: ")

        val bobot = input.nextDouble()
        print("Enter feet: ")
        val kaki = input.nextDouble()

        print("Enter inches: ")
        val inc = input.nextDouble()
        val height = kaki * 12 + inc
        val bmi = bobot * 0.45359237 /
                ((height * 0.0254) * (height * 0.0254))


        // hasil
        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }
}