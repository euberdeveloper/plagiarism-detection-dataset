package IR

import java.util.*

/**
 *
 * @author B00A50C448238A71ED479F81FA4D9066
 */

object T03 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val height: Double
        val bmi: Double

        print("Enter weight in pounds: ")
        val weight = sc.nextDouble()

        print("Enter feet: ")
        val feet = sc.nextDouble()

        print("Enter inches: ")
        val inches = sc.nextDouble()

        height = feet * 12 + inches
        bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

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
