package IR

import java.util.Scanner

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var height: Double
    var weight: Double
    var feet: Double
    var inches: Double
    var bmi: Double
    print("Enter weight in pounds: ")
    weight = sc.nextDouble()
    print("Enter feet: ")
    feet = sc.nextDouble()
    print("Enter inches: ")
    inches = sc.nextDouble()
    height = feet * 12 + inches
    bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 35 -> println("Overweight")
        else -> println("Obese")
    }
}

