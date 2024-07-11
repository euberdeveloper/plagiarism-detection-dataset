package IR

import java.util.*

object L4 {
    fun hitBmi(berat: Double, tinggi: Double): Double {
        return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var berat = 0.0
        var inci = 0.0
        var tinggi = 0.0

        var feet = 0.0

        print("Enter weight in pounds: ")
        berat = sc.nextDouble()

        print("Enter feet: ")
        feet = sc.nextDouble()
        print("Enter inches: ")
        inci = sc.nextDouble()
        tinggi = feet * 12 + inci

        println("BMI is " + hitBmi(berat, tinggi))
        if (hitBmi(berat, tinggi) < 18.5) {
            println("Underweight")
        } else if (hitBmi(berat, tinggi) < 25) {
            println("Normal")
        } else if (hitBmi(berat, tinggi) < 30) {
            println("Overweight")
        } else {
            println("Obese")
        }
    }
}
