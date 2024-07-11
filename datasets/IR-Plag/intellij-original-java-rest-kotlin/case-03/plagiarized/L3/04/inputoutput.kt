package IR

import java.util.*

internal object inputoutput {
    @JvmStatic
    fun main(args: Array<String>) {
        val kaki: Double
        val bobot: Double
        val bmi: Double
        val inc: Double
        val input = Scanner(System.`in`)
        print("Enter weight in pounds: ")

        bobot = input.nextDouble()
        print("Enter feet: ")
        kaki = input.nextDouble()

        print("Enter inches: ")
        inc = input.nextDouble()
        val height = kaki * 12 + inc
        bmi = bobot * 0.45359237 /
                ((height * 0.0254) * (height * 0.0254))


        // hasil
        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }
}