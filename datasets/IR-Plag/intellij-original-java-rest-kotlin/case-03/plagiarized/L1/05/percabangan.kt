package IR

import java.util.*

object percabangan {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val weight = input.nextDouble() //inputan weight
        print("Enter feet: ")
        val feet = input.nextDouble() //inputan feet
        print("Enter inches: ")
        val inches = input.nextDouble() //inputan inches
        val height = feet * 12 + inches // menghitung tinggi       
        val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254)) //menghitung BMI
        //menampilkan hasil
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
