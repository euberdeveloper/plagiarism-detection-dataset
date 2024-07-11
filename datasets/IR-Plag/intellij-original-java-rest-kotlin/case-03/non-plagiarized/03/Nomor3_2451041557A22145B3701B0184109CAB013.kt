package IR

import java.util.*

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
object Nomor3_2451041557A22145B3701B0184109CAB013 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val weight = sc.nextInt()
        print("Enter feet: ")
        val feet = sc.nextInt()
        print("Enter inch: ")
        val inches = sc.nextInt()
        val height = feet * 12 + inches
        val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
        println("BMI is $bmi")
        if (bmi < 18.5) {
            println("underweight")
        } else if (bmi >= 18.5 && bmi < 25) {
            println("Normal")
        } else if (bmi >= 25 && bmi < 35) {
            println("overweight")
        } else if (bmi > 35) {
            println("obese")
        }
    }
}
