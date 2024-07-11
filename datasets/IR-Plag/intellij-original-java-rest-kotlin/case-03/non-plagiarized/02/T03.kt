package IR

import java.util.*

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
object T03 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Scanner(System.`in`)
        print("Enter weight in pounds: ")
        val w = s.nextFloat()
        print("Enter feet: ")
        val f = s.nextFloat()
        print("Enter inches: ")
        val i = s.nextFloat()
        val h = f * 12 + i
        val bmi = ((w * 0.45359237) / ((h * 0.0254) * (h * 0.0254))).toFloat()
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
