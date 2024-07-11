package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 685903EF83F7A7C8A165F77EED160D9E
 */
object T04 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles           Kilometers")
        for (i in 1..9) {
            println(i.toString() + "               " + i * 1.609)
        }
        println(10.toString() + "              " + 10 * 1.609)
    }
}
