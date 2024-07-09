package IR

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val weight = sc.nextInt()
        print("Enter feet: ")
        val feet = sc.nextInt()
        print("Enter inches: ")
        val inches = sc.nextInt()
        val height = (feet * 12 + inches).toDouble()
        val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi >= 18.5 && bmi < 25) println("Normal")
        else if (bmi >= 25 && bmi < 35) println("Overweight")
        else println("Obese")
    }
}
