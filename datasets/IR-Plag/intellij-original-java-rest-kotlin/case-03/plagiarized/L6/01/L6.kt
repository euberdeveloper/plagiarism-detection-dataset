package IR

import java.util.*

object L6 {
    fun hitBmi(berat: Double, tinggi: Double): Double {
        return berat * 0.45359237 / ((tinggi * 0.0254) * (tinggi * 0.0254))
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val tinggi: Double
        var feet = 0.0

        print("Enter weight in pounds: ")
        val berat = sc.nextDouble()

        print("Enter feet: ")
        feet = sc.nextDouble()
        print("Enter inches: ")
        val inci = sc.nextDouble()
        tinggi = feet * 12 + inci

        println("BMI is " + hitBmi(berat, tinggi))
        if (hitBmi(berat, tinggi) < 25 && hitBmi(berat, tinggi) > 18.5) {
            println("Normal")
        } else if (hitBmi(berat, tinggi) < 30 && hitBmi(berat, tinggi) > 25) {
            println("Overweight")
        } else if (hitBmi(berat, tinggi) > 30) {
            println("Obese")
        } else {
            println("Underweight")
        }
    }
}
