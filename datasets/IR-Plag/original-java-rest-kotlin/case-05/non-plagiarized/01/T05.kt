package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
object T05 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        print("Enter an integer: ")
        val number = sc.nextInt()

        reverse(number)
    }

    fun reverse(number: Int) {
        var number = number
        while (number > 0) {
            print(number % 10)
            number /= 10
        }
        println()
    }
}
