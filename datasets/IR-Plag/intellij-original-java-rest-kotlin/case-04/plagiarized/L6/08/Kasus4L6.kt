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
object Kasus4L6 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")
        ShowTable(10)
    }

    private fun ShowTable(jumlahData: Int) {
        for (i in jumlahData downTo 1) {
            //Menampilkan hasil
            val temp = jumlahData + 1 - i
            println(temp.toString() + "\t\t" + ConvertMilesToKilo(temp))
        }
    }

    private fun ConvertMilesToKilo(miles: Int): Double {
        return miles * 1.609
    }
}
