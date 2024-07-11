package IR

import java.util.*

object L3 {
    @JvmStatic
    fun main(args: Array<String>) {
        var nomor = 0
        print("Enter an integer: ")

        val input = Scanner(System.`in`)

        nomor = input.nextInt()

        balik(nomor)
    }

    fun balik(nomor: Int) {
        var nomor = nomor
        var sisa = 0
        while (nomor != 0) {
            sisa = nomor % 10
            print(sisa)
            nomor = nomor / 10
        }
        println()
    }
}

