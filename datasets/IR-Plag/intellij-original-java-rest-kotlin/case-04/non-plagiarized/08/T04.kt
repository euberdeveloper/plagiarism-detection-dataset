package IR

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 6ED61D4B80BB0F81937B32418E98ADCA A94652AA97C7211BA8954DD15A3CF838
 */
object T04 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("miles \t kilometers")
        for (i in 0..9) {
            println((i + 1).toString() + "\t" + ((i + 1) * 1.609))
        }
    }
}
