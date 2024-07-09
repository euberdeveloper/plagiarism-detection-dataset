package IR

import java.util.*

object L4 {
    @JvmStatic
    fun main(args: Array<String>) {
        var nomor = 0
        print("Enter an integer: ")

        val input = Scanner(System.`in`)

        nomor = input.nextInt()

        var sisa = 0
        while (nomor != 0) {
            sisa = nomor % 10
            print(sisa)
            nomor = nomor / 10
        }
        println()
    }
}

