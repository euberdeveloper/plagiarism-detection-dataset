package IR

/**
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
object Level4 {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Miles\t\tKilometers")
        println("-------------------------------")

        tabelKonversi()
    }

    private fun tabelKonversi() {
        var mil = 1
        while (mil <= 10) {
            println("$mil\t\t${mil * 1.609}")
            mil++
        }
    }
}

