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
object PrintJava {
    @JvmStatic
    fun main(args: Array<String>) {
        printAll()
    }

    fun printAll() {
        //mencetak welcome to java sebanyak 5 kali
        for (i in 5 downTo 1) {
            print("Welcome to Java")
            println("")
        }
    }
}
