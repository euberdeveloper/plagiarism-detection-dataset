package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E3AFED0047B08059D0FADA10F400C1E5
 */
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Di sini mengulang perhitungan jarak dalam mil dan kilometer
        val jarak = 1
        printJarakDalamMilDanKilo(jarak)
    }

    fun printJarakDalamMilDanKilo(jarak: Int) {
        var jarak = jarak
        jarak = jarak
        while (jarak <= 10) {
            // Print hasil di sini sebanyak 10 kali
            println(jarak.toString() + "\t\t" + jarak * 1.609)
            jarak++
        }
    }
}
