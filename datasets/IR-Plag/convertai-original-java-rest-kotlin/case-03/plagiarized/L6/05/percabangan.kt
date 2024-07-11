package IR

import java.util.Scanner

object inputoutput {
    var kaki: Double = 0.0
    var bobot: Double = 0.0
    var bmi: Double = 0.0
    var inc: Double = 0.0
    var height: Double = 0.0

    fun hitHeight(kaki: Double, inc: Double): Double {
        return kaki * 12 + inc
    }

    fun hitBmi(bobot: Double, height: Double): Double {
        return bobot * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        println("Enter weight in pounds: ")
        bobot = input.nextDouble()
        println("Enter feet: ")
        kaki = input.nextDouble()
        println("Enter inches: ")
        inc = input.nextDouble()
        height = hitHeight(kaki, inc)
        bmi = hitBmi(bobot, height)

        // hasil
        println("BMI is $bmi")
        when {
            bmi >= 30 -> println("Obese")
            bmi >= 25 -> println("Overweight")
            bmi >= 18.5 -> println("Normal")
            else -> println("Underweight")
        }
    }
}

