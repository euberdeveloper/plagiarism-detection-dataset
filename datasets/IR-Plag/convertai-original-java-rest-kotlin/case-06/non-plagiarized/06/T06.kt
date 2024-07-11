package IR

import java.util.Scanner

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
fun main() {
    val sc = Scanner(System.`in`)
    val numbers = IntArray(10)
    for (i in 0 until 10) {
        print("Read a number : ")
        numbers[i] = sc.nextInt()
    }
    for (i in 9 downTo 0) {
        println(numbers[i])
    }
}

