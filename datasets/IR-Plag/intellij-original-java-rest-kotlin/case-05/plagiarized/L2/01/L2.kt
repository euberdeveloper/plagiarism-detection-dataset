package IR

import java.util.*

object L2 {
    @JvmStatic
    fun main(args: Array<String>) {
        print("Enter an integer: ")

        val input = Scanner(System.`in`)

        val nomor = input.nextInt()

        balik(nomor)
    }

    fun balik(nomor: Int) {
        var nomor = nomor
        while (nomor != 0) {
            val sisa = nomor % 10
            print(sisa)
            nomor = nomor / 10
        }
        println()
    }
}
