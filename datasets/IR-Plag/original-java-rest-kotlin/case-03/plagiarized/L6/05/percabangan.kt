package IR

import java.util.*

internal object inputoutput {
    var kaki: Double = 0.0
    var bobot: Double = 0.0
    var bmi: Double = 0.0
    var inc: Double = 0.0
    var height: Double = 0.0
    fun hitHeight(kaki: Double, inc: Double): Double {
        return kaki * 12 + inc
    }

    fun hitBmi(bobot: Double, height: Double): Double {
        return bobot * 0.45359237 /
                ((height * 0.0254) * (height * 0.0254))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("Enter weight in pounds: ")

        bobot = input.nextDouble()
        print("Enter feet: ")
        kaki = input.nextDouble()

        print("Enter inches: ")
        inc = input.nextDouble()
        height = hitHeight(kaki, inc)
        bmi = hitBmi(bobot, height)


        // hasil
        print("BMI is " + bmi + "\n")
        if (bmi >= 30) println("Obese")
        else if (bmi >= 25) println("Overweight")
        else if (bmi >= 18.5) println("Normal")
        else print("Underweight" + "\n")
    }
}