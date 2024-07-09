package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level2 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")

        //ulang sebanyak 10x
        var mil = 1
        while (mil <= 10) {
            println(mil.toString() + "\t\t" + mil * 1.609)
            mil++
        }
    }
}
