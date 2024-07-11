package IR

import java.util.Scanner

/**
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
fun main() {
    val sc = Scanner(System.`in`)

    print("Enter weight in pounds: ")
    val weight = sc.nextInt()
    print("Enter feet: ")
    val feet = sc.nextInt()
    print("Enter inches: ")
    val inches = sc.nextInt()

    val height = feet * 12 + inches
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

    println("BMI is $bmi")

    when {
        bmi < 18.5 -> println("Underweight")
        bmi >= 18.5 && bmi < 25 -> println("Normal")
        bmi >= 35 -> println("Obese")
    }
}

