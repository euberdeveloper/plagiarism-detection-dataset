package IR

import java.util.*

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level5 {
    @JvmStatic
    fun main(args: Array<String>) {
        val masukkan = Scanner(System.`in`)
        var angka: Int
        var sisaBagi: Int

        print("Enter an integer: ")
        angka = masukkan.nextInt()

        while (angka != 0) { //ulang sampai tidak bisa dibagi integer dengan 10
            sisaBagi = angka % 10
            print(sisaBagi)
            angka = angka / 10
        }
        println()
    }
}
