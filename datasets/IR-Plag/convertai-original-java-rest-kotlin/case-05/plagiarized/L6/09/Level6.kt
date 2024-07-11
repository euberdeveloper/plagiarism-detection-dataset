package IR

import java.util.Scanner

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level6 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter an integer: ")
        val input = Scanner(System.`in`)
        val bil = input.nextInt()

        rekursif(bil)
        println("")
    }

    //rekursif ah...
    private tailrec fun rekursif(bil: Int): Int {
        return if (bil != 0) {
            val sisaMod = bil % 10
            print(sisaMod)
            rekursif(bil / 10)
        } else {
            bil
        }
    }
}

