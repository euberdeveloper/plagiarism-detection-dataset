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
object Kasus4L5 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        // Use for loop
        for (i in 1..10) {
            //Menampilkan hasil
            //i = miles
            println(i.toString() + "\t\t" + ConvertMilesToKilo(i))
        }
    }

    private fun ConvertMilesToKilo(miles: Int): Double {
        return miles * 1.609
    }
}
