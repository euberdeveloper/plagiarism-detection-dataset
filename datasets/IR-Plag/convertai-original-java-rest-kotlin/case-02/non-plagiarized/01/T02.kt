package IR

import java.util.Scanner

/**
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
fun main() {
    val sc = Scanner(System.`in`)

    print("Enter the radius and length of a cylinder: ")
    val radius = sc.nextDouble()
    val length = sc.nextDouble()

    val area = radius * radius * 3.14159
    val volume = area * length

    println("The area is $area")
    printf("The volume is %.1f", volume)
    println()
}

