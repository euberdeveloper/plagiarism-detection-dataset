package IR

import java.util.Scanner

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer : ")
    val number = sc.nextInt()
    reverse(number)
}

fun reverse(number: Int) {
    val numberString = number.toString()
    for (i in numberString.length - 1 downTo 0) {
        print(numberString[i])
    }
    println("")
}

