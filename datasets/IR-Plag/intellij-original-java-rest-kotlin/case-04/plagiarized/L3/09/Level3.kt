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
object Level3 {
    @JvmStatic
    fun main(args: Array<String>) {
        //inisialisasi
        var mile = 1

        println("Miles\t\tKilometers")
        println("-------------------------------")

        while (mile <= 10) {
            println(mile.toString() + "\t\t" + mile * 1.609)
            mile++
        }
    }
}
