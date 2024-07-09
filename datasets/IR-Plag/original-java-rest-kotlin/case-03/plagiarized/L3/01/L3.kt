package IR

import java.util.*

object L3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var berat = 0.0
        var inci = 0.0
        var tinggi = 0.0
        var bmi = 0.0
        var feet = 0.0

        print("Enter weight in pounds: ")
        berat = sc.nextDouble()

        print("Enter feet: ")
        feet = sc.nextDouble()
        print("Enter inches: ")
        inci = sc.nextDouble()
        tinggi = feet * 12 + inci

        bmi = (berat * 0.45359237
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
