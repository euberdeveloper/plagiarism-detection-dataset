package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author 6968A2C57C3A4FEE8FADC79A80355E4D F13FFB0C4AF5E1CE7C646A5222FBC1E9 2451041557A22145B3701B0184109CAB035
 */
object T06 {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)

        val array = IntArray(10)
        for (i in array.indices) {
            print("Read a number: ")
            array[i] = sc.nextInt()
        }

        println(array[9])
        println(array[8])
        println(array[7])
        println(array[6])
        println(array[5])
        println(array[4])
        println(array[3])
        println(array[2])
        println(array[1])
        println(array[0])
    }
}
