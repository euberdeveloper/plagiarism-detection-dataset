package IR

import java.util.Scanner

/**
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter weight in pounds: ")
    val weight = sc.nextDouble()
    print("Enter feet: ")
    val feet = sc.nextDouble()
    print("Enter Inches: ")
    val inches = sc.nextDouble()
    val height = feet * 12 + inches
    val bmi = weight * 0.45359237 / Math.pow((height * 0.0254), 2.0)
    println("BMI is $bmi")
    when {
        bmi < 18.5 -> println("underweight")
        bmi < 25 -> println("normal")
        bmi < 35 -> println("overweight")
        else -> println("obese")
    }
}

