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
object Kasus4L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use while loop
        var counter = 1
        while (counter <= 10) {
            //Menampilkan hasil
            //counter = miles
            println(counter.toString() + "\t\t" + counter * 1.609)
            counter++
        }
    }
}
