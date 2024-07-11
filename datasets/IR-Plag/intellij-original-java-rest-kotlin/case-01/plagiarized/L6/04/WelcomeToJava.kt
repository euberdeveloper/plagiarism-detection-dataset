package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C166AB8FBBBE55174E16A67530426A8A 19011F43894F06E2BA0CA74061427469
 */
object WelcomeToJava {
    fun test(i: Int): String {
        var i = i
        if (i > 0) {
            println("Welcome To Java")
            return test(--i)
        } else return ""
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val i = 5
        test(i)
    }
}
