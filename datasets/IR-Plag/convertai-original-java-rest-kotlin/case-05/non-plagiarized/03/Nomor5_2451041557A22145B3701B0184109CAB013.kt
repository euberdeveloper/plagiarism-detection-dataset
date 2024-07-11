package IR

import java.util.Scanner

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter an integer : ")
    val number = sc.nextInt()
    reverse(number)
}

fun reverse(number: Int) {
    val strNumber = number.toString()
    var temp = ""
    for (i in strNumber.length downTo 1) {
        temp += i
    }
    val tempNumber = temp.toInt()
    println(tempNumber)
}

