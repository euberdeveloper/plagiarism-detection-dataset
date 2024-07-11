package IR

import java.util.*

/**
 *
 * @author 4900D0A19B6894A4A514E9FF3AFCC2C0
 */
object Soal3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val weight = sc.nextDouble()
        print("Enter feet: ")
        val feet = sc.nextDouble()
        print("Enter inches: ")
        val inches = sc.nextDouble()
        val height = feet * 12 + inches
        val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi >= 18.5 && bmi < 25) println("Normal")
        else if (bmi >= 25 && bmi < 35) println("Overweight")
        else println("Obese")
    }
}
