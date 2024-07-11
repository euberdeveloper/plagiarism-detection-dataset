package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object Kasus4 {
    fun Konversi(n: Int) {
        var miles = 1
        while (miles <= n) {
            println(miles.toString() + "\t\t" + miles * 1.609)
            miles++
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use while loop
        Konversi(10)
    }
}
