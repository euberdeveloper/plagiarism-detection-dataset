package IR

import java.util.Scanner

/**
 *
 * @author 65FBEF05E01FAC390CB3FA073FB3E8CF (452BF208BF901322968557227B8F6EFE010)
 */
fun main() {
    val s = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val w = s.nextFloat()
    print("Enter feet: ")
    val f = s.nextFloat()
    print("Enter inches: ")
    val i = s.nextFloat()
    val h = f * 12 + i
    val bmi = (w * 0.45359237) / ((h * 0.0254) * (h * 0.0254))
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi >= 18.5 && bmi < 25 -> println("Normal")
        bmi >= 25 && bmi < 35 -> println("Overweight")
        bmi >= 35 -> println("Obese")
    }
}

