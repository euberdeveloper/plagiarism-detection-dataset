package IR

import java.util.*

object cabang {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val h: Double
        val TotalBmi: Double
        print("Enter weight in pounds : ")
        val w = input.nextDouble() //inputan weight
        print("Enter feet : ")
        val f = input.nextDouble() //inputan feet
        print("Enter inches : ")
        val i = input.nextDouble() //inputan inches
        h = f * 12 + i // menghitung tinggi       
        TotalBmi = HitBMI(w, h) //menghitung BMI
        //menampilkan hasil
        println("BMI is $TotalBmi")
        Result(TotalBmi)
    }

    fun HitBMI(w: Double, h: Double): Double {
        return w * 0.45359237 / ((h * 0.0254) * (h * 0.0254))
    }

    fun Result(TotalBmi: Double) {
        if (TotalBmi < 18.5) {
            println("Underweight ")
        } else if (TotalBmi < 25) {
            println("Normal ")
        } else if (TotalBmi < 30) {
            println("Overweight ")
        } else {
            println("Obese ")
        }
    }
}