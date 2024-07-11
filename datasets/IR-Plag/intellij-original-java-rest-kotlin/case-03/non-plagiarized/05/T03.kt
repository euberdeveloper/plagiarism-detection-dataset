package IR

import java.util.*

object T03 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val w = sc.nextInt()
        print("Enter feet: ")
        val f = sc.nextInt()
        print("Enter inches: ")
        val i = sc.nextInt()
        val bmi = ((w * 0.45359237) / (((f * 12 + i) * 0.0254) * ((f * 12 + i) * 0.0254)))
        println("BMI is $bmi")
        if (bmi < 18.5) {
            println("Underweight")
        } else if (bmi >= 18.5 && bmi < 25) {
            println("Normal")
        } else if (bmi >= 25 && bmi < 35) {
            println("Overweight")
        } else if (bmi >= 35) {
            println("Obese")
        }
    }
}