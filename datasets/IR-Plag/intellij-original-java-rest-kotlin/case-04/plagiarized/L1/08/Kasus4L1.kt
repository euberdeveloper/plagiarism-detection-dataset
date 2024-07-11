package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
object Kasus4L1 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use while loop
        var miles = 1
        while (miles <= 10) {
            //Menampilkan hasil
            println(miles.toString() + "\t\t" + miles * 1.609)
            miles++
        }
    }
}
