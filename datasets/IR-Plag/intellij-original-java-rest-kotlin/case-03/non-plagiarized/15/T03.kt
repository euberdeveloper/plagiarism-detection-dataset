package IR

import java.util.*

/**
 *
 * @author FD820A2B4461BDDD116C1518BC4B0F77 871C87F67A53ECC7201FF41AF0A05032
 */
object T03 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val bmi: Double
        val height: Double
        print("Enter weight in pounds: ")
        val weight = sc.nextDouble()
        print("Enter feet: ")
        val feet = sc.nextDouble()
        print("Enter inches: ")
        val inches = sc.nextDouble()
        height = feet * 12 + inches
        bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
        println("BMI is $bmi")
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 35) println("Overweight")
        else println("Obese")
    }
}
