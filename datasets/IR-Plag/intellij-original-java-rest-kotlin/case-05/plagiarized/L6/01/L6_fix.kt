package IR

import java.util.*

object L6_fix {
    @JvmStatic
    fun main(args: Array<String>) {
        var nomor: Int
        var sisa = 0
        print("Enter an integer: ")
        val input = Scanner(System.`in`)

        nomor = input.nextInt()


        while (nomor != 0) {
            if (nomor != 0) {
                sisa = nomor % 10
                print(sisa)
                nomor = nomor / 10
            }
        }
        println()
    }
}

