package IR

import java.util.*

object L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        print("Enter weight in pounds: ")
        val berat = sc.nextDouble()

        print("Enter feet: ")
        val feet = sc.nextDouble()
        print("Enter inches: ")
        val inci = sc.nextDouble()
        val tinggi = feet * 12 + inci

        val bmi = (berat * 0.45359237
                / ((tinggi * 0.0254) * (tinggi * 0.0254)))

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
