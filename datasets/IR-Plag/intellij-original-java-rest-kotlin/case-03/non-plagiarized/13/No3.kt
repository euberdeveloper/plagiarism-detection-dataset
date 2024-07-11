package IR

import java.util.*

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
object No3 {
    /**
     * @param args the command line arguments
     */
    @JvmStatic
    fun main(args: Array<String>) {
        // TODO code application logic here
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
        if (bmi < 18.5) println("Underweight")
        else if (bmi < 25) println("Normal")
        else if (bmi < 35) println("Overweight")
        else println("Obese")
    }
}
