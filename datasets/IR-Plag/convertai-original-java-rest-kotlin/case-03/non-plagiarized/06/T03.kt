package IR

import java.util.Scanner

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter weight in pounds : ")
    val weight = sc.nextDouble()
    print("Enter feet : ")
    val feet = sc.nextDouble()
    print("Enter inches : ")
    val inches = sc.nextDouble()
    val height = feet * 12 + inches
    val bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    println("The area is $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi < 25 -> println("Normal")
        bmi < 35 -> println("Overweight")
        else -> println("Obese")
    }
}

