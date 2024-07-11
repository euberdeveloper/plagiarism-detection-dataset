package IR

import java.util.Scanner

object inputoutput {
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
        val bobot = input.nextDouble()
        println("Enter feet: ")
        val kaki = input.nextDouble()
        println("Enter inches: ")
        val inc = input.nextDouble()
        val height = hitHeight(kaki, inc)
        val bmi = hitBmi(bobot, height)

        // hasil
        println("BMI is $bmi")
        when {
            bmi < 18.5 -> println("Underweight")
            bmi < 25 -> println("Normal")
            bmi < 30 -> println("Overweight")
            else -> println("Obese")
        }
    }
}

