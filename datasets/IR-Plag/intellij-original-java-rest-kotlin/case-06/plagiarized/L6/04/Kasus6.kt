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
object Kasus6 {
    fun simpanArray(arr: IntArray, i: Int) {
        var i = i
        val sc = Scanner(System.`in`)

        if (i > 0) {
            simpanArray(arr, --i)
            print("Read a number: ")
            arr[i] = sc.nextInt()
        }
    }

    fun tampilArray(arr: IntArray, i: Int) {
        var i = i
        if (i >= 0) {
            println(arr[i])
            tampilArray(arr, --i)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var n = 10
        val arr = IntArray(n)
        simpanArray(arr, n)
        tampilArray(arr, --n)
    }
}
