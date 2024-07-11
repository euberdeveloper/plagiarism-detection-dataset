package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template fil3e, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
object T05 {
    var a: Int = 0

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        print("Enter an integer:")
        val a = sc.nextInt()
        reverse(a)
    }

    fun reverse(number: Int) {
        var number = number
        var reverse = 0
        while (number != 0) {
            reverse = reverse * 10
            reverse = reverse + number % 10
            number = number / 10
        }
        println(reverse)
    }
}
