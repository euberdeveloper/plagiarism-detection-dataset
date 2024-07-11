package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 51BE04B11C5F2F5AD96A396632DC3F76
 */
object t04 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\tKilometers")
        for (i in 1..10) {
            println(i.toString() + "\t" + i * 1.609)
        }
    }
}
