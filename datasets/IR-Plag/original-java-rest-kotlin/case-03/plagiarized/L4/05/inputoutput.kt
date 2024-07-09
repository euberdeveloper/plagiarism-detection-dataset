package IR

import java.util.*

internal object inputoutput {
    fun hitHeight(kaki: Double, inc: Double): Double {
        return kaki * 12 + inc
    }

    fun hitBmi(bobot: Double, height: Double): Double {
        return bobot * 0.45359237 /
                ((height * 0.0254) * (height * 0.0254))
    }

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
        val height = hitHeight(kaki, inc)
        bmi = hitBmi(bobot, height)


        // hasil
        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 30) println("Overweight")
        else println("Obese")
    }
}