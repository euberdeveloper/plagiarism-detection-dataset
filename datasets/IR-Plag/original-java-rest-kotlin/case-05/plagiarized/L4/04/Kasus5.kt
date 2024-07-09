package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus5 {
    fun reverse(number: Int) {
        print(number % 10)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")
        val input = Scanner(System.`in`)
        var number = input.nextInt()

        while (number > 0) {
            reverse(number)
            number /= 10
        }
        println("")
    }
}
